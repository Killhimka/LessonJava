package Многопоточность.Hw;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class HwCyclicBarier {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new Ran());
        new Sportsmen(cyclicBarrier);
        new Sportsmen(cyclicBarrier);
        new Sportsmen(cyclicBarrier);

    }
    static class Ran extends Thread{
        @Override
        public void run() {
            System.out.println("Start!");
        }
    }
    static class Sportsmen extends Thread{
        CyclicBarrier cyclicBarrier;

        public Sportsmen(CyclicBarrier cyclicBarrier) throws InterruptedException {
            this.cyclicBarrier = cyclicBarrier;
            start();
            System.out.println("И я тут ");
            sleep(2000);

        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
    }
}
