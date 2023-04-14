package Многопоточность.Hw;
// Контроль потоков


import java.util.concurrent.*;

public class HwExecutor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new Potoc1(countDownLatch,"1"));
        executorService.submit(new Potoc1(countDownLatch,"2"));
        executorService.submit(new Potoc1(countDownLatch,"3"));
        executorService.submit(new Potoc1(countDownLatch,"4"));
        executorService.submit(new Potoc1(countDownLatch,"5"));
        executorService.submit(new Potoc1(countDownLatch,"6"));
        executorService.submit(new Potoc1(countDownLatch,"7"));
        executorService.submit(new Potoc1(countDownLatch,"8"));
        executorService.submit(new Potoc1(countDownLatch,"9"));
        executorService.submit(new Potoc1(countDownLatch,"10"));

        countDownLatch.await();
        for (int i = 0; i < 10; i++) {
            System.out.println(executorService.submit(new Potoc1(countDownLatch,"11")).get());

        }
        System.out.println("Stop");
        /*System.exit(2);*/
        executorService.shutdown();

    }
    static class Potoc1 implements Runnable{
        CountDownLatch countDownLatch;
        String name;

        public Potoc1(CountDownLatch countDownLatch, String name) {
            this.countDownLatch = countDownLatch;
            this.name=name;
            new Thread(this);

        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(name +" "+i);
            }
            countDownLatch.countDown();
        }
    }

}
