package Многопоточность.Hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HwSynchronized {
    public static void main(String[] args) throws InterruptedException {
        ArrayList <Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
        /*List<Integer>list = new ArrayList<>();*/  // Не синхронизированный лист
            List<Integer> list = Collections.synchronizedList(new ArrayList<>()); //Синхронизированный
            Runnable runnable = () -> {
                list.addAll(source);
            };

            Thread thread1 = new Thread(runnable);
            Thread thread2 = new Thread(runnable);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println(list);

    }
}
