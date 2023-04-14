package Многопоточность.Hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HwSynchronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        List <Integer> list1 = Collections.synchronizedList(list);  // Синхронизировали готовый лист

                Runnable runnable = ()->{
                    synchronized (list1) {       // При работе с итератором нужно синхронизировать его работу
                        Iterator<Integer> iterator = list1.iterator();
                        while (iterator.hasNext())
                            System.out.println(iterator.next());
                    }
                };
                Runnable runnable1 = ()-> list1.remove(10);

                Thread thread = new Thread(runnable);
                Thread thread1 = new Thread(runnable1);
                thread.start();
                thread1.start();
                thread.join();
                thread1.join();
        System.out.println(list1);
    }
}
