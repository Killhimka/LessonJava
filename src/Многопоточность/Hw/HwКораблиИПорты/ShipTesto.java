package Ships888;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShipTesto {
    public static void main(String[] args) {
        List<Ship> listShip = new ArrayList<>();
        Tunnel tunnel = new Tunnel(listShip);
        ShipGenerator shipGenerator = new ShipGenerator(tunnel);
        shipGenerator.start();
    }
}
class Ship{
    int count;
    String name;
    @Override
    public String toString() {
        return  count + " " + name;
    }
}
class ShipGenerator extends Thread{
    Tunnel tunnel;

    public ShipGenerator(Tunnel tunnel) {
        this.tunnel = tunnel;
    }

    @Override
    public void run() {
        if (tunnel.countStop==20){
            System.exit(1);
        }else {
            while (tunnel.listTunnelShip.size() != 5) {
                tunnel.add();
            }
        }
        System.out.println(tunnel.listTunnelShip);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Port(tunnel,"Banana"));
        executorService.submit(new Port(tunnel,"Cloches"));
        executorService.submit(new Port(tunnel,"Bread"));
        executorService.shutdown();
    }
}
class Port extends Thread{
    Tunnel tunnel;
    String name;

    public Port(Tunnel tunnel, String name) {
        this.tunnel = tunnel;
        this.name = name;
    }

    @Override
    public  void run() {
        List<Ship> listShipPort = new ArrayList<>();
        for (int i = 0; i < tunnel.listTunnelShip.size(); i++) {
            Ship s = tunnel.listTunnelShip.get(i);
            if (name.contains(s.name)) {
                listShipPort.add(s);
            }
        }
        for (int i = 0; i < listShipPort.size(); i++) {
            Ship s = listShipPort.get(i);
            try {
                join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tunnel.countStop++;
            if (s.count==10){
                try {
                    System.out.println(getName()+" Грузит "+s);
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (s.count==50){
                try {
                    System.out.println(getName()+" Грузит "+s);
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    System.out.println(getName()+" Грузит "+s);
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        tunnel.count++;
        if (tunnel.count==3){
            tunnel.listTunnelShip.removeAll(tunnel.listTunnelShip);
            tunnel.count=0;
            try {
                join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Загружено кораблей " + tunnel.countStop);
            new ShipGenerator(tunnel).start();
        }
        System.out.println(listShipPort+" "+name + " "+getName()+" FINISH");
    }
}
class Tunnel {
    List<Ship> listTunnelShip;
    int count;
    int countStop;

    public Tunnel(List<Ship> listTunnelShip) {
        this.listTunnelShip = listTunnelShip;
    }

    public synchronized void add(){
            listTunnelShip.add(ship());
    }
    public Ship ship() {  // Функция
        Ship ship1 = new Ship();
        String[] nameArr = {"Banana", "Bread", "Cloches"};
        int[] vesArr = {10, 50, 100};
        ship1.count = vesArr[new Random().nextInt(vesArr.length)];
        ship1.name = nameArr[(new Random().nextInt(nameArr.length))];
        return ship1;
    }
}



