package Flot;

import com.mysql.cj.util.StringUtils;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List <String> listGenerator = new LinkedList<>();
        List <String> listPort = new LinkedList<>();

        Control control = new Control();
        control.control(listGenerator);

        Tunnel tunnel = new Tunnel(listPort);
        tunnel.tunnel(listGenerator);

        List <String> listBanana = Collections.synchronizedList(new ArrayList<>());
        List <String> listCloches = Collections.synchronizedList(new ArrayList<>());
        List <String> listBread = Collections.synchronizedList(new ArrayList<>());
        Potoc potoc = new Potoc(listPort,listBanana,listCloches,listBread);
        potoc.start();
        Thread.sleep(100);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Port(listBanana,"Banana"));
        executorService.submit(new Port(listCloches,"Cloches"));
        executorService.submit(new Port(listBread,"Bread"));
        executorService.shutdown();

    }

    static class Port extends Thread {
        List<String> list ;
        String name;
        public Port(List<String> list, String name) {
            this.list = list;
            this.name = name;
        }
        @Override
        public synchronized void run() {
            System.out.println(list + " POTOC Взял " + name);
            while (list.size()!=0) {
                for (String s : list) {
                    if (StringUtils.endsWithIgnoreCase(s, "10")) {
                        try {
                            sleep(1000);
                            list.remove(s);
                            System.out.println("10 " + name + " Загружен");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (s.contains("50")) {
                        try {
                            sleep(3000);
                            list.remove(s);
                            System.out.println("50 " + name + " Загружен");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else if (s.contains("100")) {
                        try {
                            sleep(5000);
                            list.remove(s);
                            System.out.println("100 " + name + " Загружен");
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(list + " potoc Осталось " + name);
                }
            }
        }
    }
}
class Potoc extends Thread{
  List<String> listPort;
  List<String> listBanana;
  List<String> listCloches;
  List<String> listBread;
    public Potoc(List<String> listPort, List<String> listBanana,
                 List<String> listCloches, List<String> listBread) {
        this.listPort = listPort;
        this.listBanana = listBanana;
        this.listCloches = listCloches;
        this.listBread = listBread;
    }
    @Override
    public synchronized void run() {
        System.out.println(" " + listPort + " Port List ");
        if (listPort.size() > 0) {
            for (String s : listPort) {
                if (s.contains("Banana")) {
                    listBanana.add(s);
                    /*listPort.remove(s);*/
                } else if (s.contains("Cloches")) {
                    listCloches.add(s);
                    /*listPort.remove(s);*/
                } else if (s.contains("Bread")) {
                    listBread.add(s);
                    /*listPort.remove(s);*/
                }
            }
           /* System.out.println(listCloches + " PORT cloches");
            System.out.println(listBanana + " PORT banana");
            System.out.println(listBread + "PORT bread");*/
        }
    }
}
class Tunnel {
    List <String> listPort;

    public Tunnel(List<String> listPort) {
        this.listPort = listPort;
    }
    public synchronized void tunnel(List<String> listGenerator) {
        /*System.out.println(listGenerator + " TUNNEL " );
        System.out.println(listPort + " TUNNEL port");*/
        if (listGenerator.size()==5){
            while (listGenerator.size()!=0){
                listPort.add(listGenerator.remove(0));
            }
        }
           /* System.out.println(listGenerator + " TUNNEL " );
            System.out.println(listPort + " TUNNEL port" );*/
    }
}
class Control {
    synchronized void control(List<String> listGenerator) {
        Verf verf = new Verf();
        String[] nameArr1 = {"Banana", "Bread", "Cloches"};
        String[] vesArr = {"10", "50", "100"};
            if (listGenerator.size() < 5) {
                while (listGenerator.size() != 5) {
                    listGenerator.add(verf.random(nameArr1, vesArr));
                }
            }
        /*System.out.println(listGenerator+" CONTROL POSLE "+"2");*/
    }
}
class Verf{
    public String random(String[] nameArr, String[] vesArr){
        String s = nameArr[new Random().nextInt(nameArr.length)].concat(" ")
                .concat(vesArr[new Random().nextInt(vesArr.length)]);
        return s;
    }
}



