package Многопоточность.Hw;

import java.util.concurrent.Semaphore;

public class HwSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            Auto auto = new Auto();
            auto.semaphore=semaphore;
            auto.start();
        }
    }
    static class Auto extends Thread{
        Semaphore semaphore;
        @Override
        public void run() {
            System.out.println(this.getName()+" Машина приехала");
            try {
                semaphore.acquire();
                System.out.println(this.getName()+" Машина въехала на парковку");
                sleep(1000);
                System.out.println(this.getName()+" Машина выехала с парковки");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
