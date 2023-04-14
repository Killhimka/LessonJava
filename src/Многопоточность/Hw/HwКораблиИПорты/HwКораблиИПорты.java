package Многопоточность.Hw.HwКораблиИПорты;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class HwКораблиИПорты {
    public static void main(String[] args) throws InterruptedException {
        /*CyclicBarrier cyclicBarrier = new CyclicBarrier(1,new Potoc1());
        Verf verf = new Verf(cyclicBarrier);*/

        /*verf.getVerf();*/
        Port port = new Port();
        Semaphore semaphore = new Semaphore(5);
        Tunnel blocnot = new Tunnel();
        blocnot.Bloc();
        Thread.sleep(2);


        /*for (int i = 0; i < 10; i++) {
            Potoc potoc1 = new Potoc(
                    verf.nameList.remove((int) (Math.random() * verf.nameList.size())),
                    verf.weight.remove((int) (Math.random() * verf.weight.size())),cyclicBarrier);

            potoc1.semaphore=semaphore;
            *//*potoc1.join();*//*
            verf.count++;
            if (potoc1.name.equals("Banana")) {
                port.countBanana++;
                port.bananaList.add(potoc1.name.concat((" "+potoc1.weight+" "+potoc1.getName())));
            }
            if (potoc1.name.equals("Bread")) {
                port.countBread++;
                port.breadList.add(potoc1.name.concat((" "+potoc1.weight+" "+potoc1.getName())));
            }
            if (potoc1.name.equals("Cloches")) {
                port.countCloches++;
                port.clochesList.add(potoc1.name.concat((" "+potoc1.weight+" "+potoc1.getName())));
            }
            potoc1.join();
        }

        port.Banana();
        port.Cloches();
        port.Bread();*/
        /*System.out.println(verf.count);
        System.out.println(verf.listName);
        System.out.println(verf.weight);
        System.out.println(verf.nameList);*/

    }
    static class Potoc1 extends Thread{
        @Override
        public void run() {
            System.out.println(getName());
        }
    }
    static class Potoc extends Thread {
        CyclicBarrier cyclicBarrier;
        Port port;
        Verf verf;
         Semaphore semaphore;
         String name;
         int weight;

        public Potoc(String name, int weight,CyclicBarrier cyclicBarrier) {
            this.name = name;
            this.weight = weight;
            this.cyclicBarrier = cyclicBarrier;
            start();
        }

        public void run() {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Корабль: "+name+" "+weight+" - вошел в туннель. ");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
            System.out.println("Корабль: "+name+" "+weight+" - покинул туннель. ");
            try {
                this.cyclicBarrier = cyclicBarrier;
            }catch (NullPointerException nullPointerException){

            }


        }


    }
}
