package Многопоточность.Hw;
// Ожидание выполнения
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class HwCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch =new CountDownLatch(5);
            Work work = new Work(countDownLatch);
            Work work1 = new Work(countDownLatch);
            Work work2 = new Work(countDownLatch);
            Work work3 = new Work(countDownLatch);
            Work work4 = new Work(countDownLatch);

        countDownLatch.await();

        System.out.println(((((work.n+ work4.n)+work1.n)+ work3.n)+ work2.n)/2);
        System.out.println("Конец");
    }
    static class Work extends Thread{
        CountDownLatch countDownLatch;
        int n;

        public Work(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
            start();
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            System.out.println(this.getName()+" Я закончил");
            countDownLatch.countDown();
        }
    }
}
