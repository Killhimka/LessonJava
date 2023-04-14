package Многопоточность.Hw.HwКораблиИПорты;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class Verf extends Thread{
    CountDownLatch countDownLatch;
    Exchanger exchanger;
    Port port;
    Verf verf;
    Tunnel tunnel;

     String name ;
     int weight ;

    public Verf(String name, int weight,Exchanger<String> exchanger) {
        this.name = name;
        this.weight = weight;
        this.exchanger = exchanger;
        start();
    }

    Semaphore semaphore;


    @Override
    public void run() {

        /*try {
                semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(name+" "+weight+" - Корабль вошел в туннель");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            exchanger.exchange(name+" "+weight+" - Корабль вышел из туннеля");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            try {
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        /*System.out.println(exchanger.exchange(null));*/
        /*semaphore.release();*/
        /*countDownLatch.countDown();*/


    }


}
