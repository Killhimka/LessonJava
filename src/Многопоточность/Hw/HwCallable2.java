package Многопоточность.Hw;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class HwCallable2 implements Callable {
    public String call(){
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future> list = new ArrayList<>();
        Callable callable = new HwCallable2();
        for (int i = 0; i < 100; i++) {
            Future future = executor.submit(callable);
            list.add(future);
        }
        for (Future fut: list){
            try {
                System.out.println(new Date()+"::"+fut.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
