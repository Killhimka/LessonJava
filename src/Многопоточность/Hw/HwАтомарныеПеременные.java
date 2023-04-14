package ћногопоточность.Hw;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Hwјтомарныеѕеременные {
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10000; i++) {
            new MyThread().start();
        }
        Thread.sleep(2000);
        System.out.println(atomicInteger.get());
    }
    static class MyThread extends Thread{

        @Override
        public void run() {
            atomicInteger.incrementAndGet();

        }

    }
}
