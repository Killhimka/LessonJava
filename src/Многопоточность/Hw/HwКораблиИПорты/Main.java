package Flot;

import com.mysql.cj.util.StringUtils;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List <String> listGenerator = new ArrayList<>();
        /*Potoc potoc = new Potoc(listGenerator);
        potoc.start();*/
        int count=0;
        Control control = new Control();
        control.control(listGenerator);
        Tunnel tunnel = new Tunnel();
        tunnel.tunnel(listGenerator);
        /*control.control(listGenerator);*/
        List <String> listBanana = Collections.synchronizedList(new ArrayList<>());
        List <String> listCloches = Collections.synchronizedList(new ArrayList<>());
        List <String> listBread = Collections.synchronizedList(new ArrayList<>());
        List <String> tunnelList = Collections.synchronizedList(new ArrayList<>());
            /*CountDownLatch countDownLatch =new CountDownLatch(2);
            Tunnel tunnel = new Tunnel(tunnelList, countDownLatch, count1);
            Port port = new Port(listBanana, listCloches, tunnelList, listBread,countDownLatch);*/

       /* countDownLatch.await();*/
           /* ExecutorService executorService1 = Executors.newFixedThreadPool(3);
           *//* executorService1.submit(new Tunnel(tunnelList,countDownLatch));
            executorService1.submit(new Port(listBanana, listCloches, tunnelList, listBread,countDownLatch));*//*
            executorService1.submit(new PortBanana(listBanana, "Banana"));
            executorService1.submit(new PortBanana(listCloches, "Cloches"));
            executorService1.submit(new PortBanana(listBread, "Bread"));
                executorService1.shutdown();*/


        System.out.println(listBanana+" "+listCloches+" "+listBread+" MAIN");
    }

    static class PortBanana extends Thread {
        Semaphore semaphore;
        List<String> list ;
        String name;
        public PortBanana(List<String> list,String name) {
            this.list = list;
            this.name=name;
        }
        @Override
        public synchronized void run() {
            System.out.println(list + " POTOC Взял " + name);
            while (list.size()>0) {
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
class Port extends Thread{
    CountDownLatch count;
    List <String> listBanana;
    List <String> listCloches;
    List <String> listBread;
    List<String>list;
    public Port(List<String> listBanana, List<String> listCloches, List<String> list,
                List <String> listBread, CountDownLatch count) {
        this.listBanana = listBanana;
        this.listCloches = listCloches;
        this.listBread = listBread;
        this.list = list;
        this.count = count;
        start();
    }
    @Override
    public synchronized void run() {
        System.out.println(" "+list+" Port List ");
        if (list.size()>0) {
           notifyAll();
            for (String s : list) {
                if (s.contains("Banana")) {
                    listBanana.add(s);

                }
                else if (s.contains("Cloches")) {
                    listCloches.add(s);

                }
                else if (s.contains("Bread")) {
                    listBread.add(s);

                }
            }
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

            list.removeAll(list);

        System.out.println(listCloches+" PORT cloches");
        System.out.println(listBanana+" PORT banana");
        System.out.println(listBread+"PORT bread");
        count.countDown();
    }

}
class Tunnel {
    /*List<String> listGenerator;
    Control control;
    public Tunnel(List<String> listGenerator) throws InterruptedException {*/
      /*  this.listGenerator=listGenerator;
    }*/

    public synchronized void tunnel(List<String> listGenerator) throws InterruptedException {
        List<String> listGenerator1 = new LinkedList<>();
        System.out.println(listGenerator + " TUNNEL " );
        System.out.println(listGenerator1 + " TUNNEL ");
        if (listGenerator.size()==5){
            notify();
            while (listGenerator.size()!=0){
                listGenerator1.add(listGenerator.remove(0));
            }
        }
        if (listGenerator.size()==0) {
            System.out.println(listGenerator + " TUNNEL " );
            System.out.println(listGenerator1 + " TUNNEL " );
            wait();
        }

    }
}
/*class Potoc extends Thread{
    Tunnel tunnel;
    Control control;
    List <String> listGenerator;

    public Potoc(List<String> listGenerator) {
        this.listGenerator = listGenerator;
    }

    @Override
    public void run() {
        synchronized (this) {
            if (listGenerator.size()!=0){
                notify();
                try {
                    control.control(listGenerator);
                    tunnel.tunnel();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(listGenerator.size()==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("tunnel.listGenerator = " + listGenerator);
        }
    }
}*/
class Control {
    synchronized void control(List<String> listGenerator) throws InterruptedException {
        Verf verf = new Verf();
        String[] nameArr1 = {"Banana", "Bread", "Cloches"};
        String[] vesArr = {"10", "50", "100"};
            if (listGenerator.size() < 5) {
                while (listGenerator.size() != 5) {
                    listGenerator.add(verf.random(nameArr1, vesArr));
                }
                System.out.println(listGenerator+" CONTROL DO "+"2 ");
                if (listGenerator.size()==5){
                }
            }

        System.out.println(listGenerator+" CONTROL POSLE "+"2");
    }
}
class Verf{
    public String random(String[] nameArr, String[] vesArr){
        String s = nameArr[new Random().nextInt(nameArr.length)].concat(" ")
                .concat(vesArr[new Random().nextInt(vesArr.length)]);
        return s;
    }
}



