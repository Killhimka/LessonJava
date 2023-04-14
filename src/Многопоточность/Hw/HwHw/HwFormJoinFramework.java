package Многопоточность.Hw.HwHw;
// Считывает потоки ПК и разбивает операцию на потоки
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class HwFormJoinFramework {
    static long aLong = 10000000000l;
    static int MyThread = Runtime.getRuntime().availableProcessors(); // считывает количество ядер ПК
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(MyThread);
        ForkJoinPool pool = new ForkJoinPool(MyThread);
        System.out.println(pool.invoke(new MyFork(0,aLong)));

        System.out.println(date);
    }
    static class MyFork extends RecursiveTask<Long>{
        long from,to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to-from)<=aLong/MyThread){
                long j = 0;
                for (long i = from; i < to; i++) {
                    j+=i;
                }
                return j;
            } else {
                long middle = (to+from)/2;
                MyFork firstHalf = new MyFork(from,middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle+1,to);
                long secondValue =secondHalf.compute();   // запускает счетчик
                return firstHalf.join() + secondValue;
            }
        }
    }
}
