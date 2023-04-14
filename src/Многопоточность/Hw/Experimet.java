package Многопоточность.Hw;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Experimet {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Date());
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        /*myThread1.start();*/
        myThread.join();
        myThread1.join();

        System.out.println(new Date());

    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            Pool pool = new Pool();
            pool.getX();
        }
    }
    static public class Pool{
        AtomicInteger atomicInteger = new AtomicInteger(0);

        public AtomicInteger getX() {
            int a = 1000000000;
            for (int i = 0; i < a; i++) {
                atomicInteger.incrementAndGet();
            }
            System.out.println(atomicInteger);
            return atomicInteger;
        }
    }
}
