package Многопоточность.Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Hw1 {

    public static class Collection{
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = Collections.synchronizedList(list);
        public List<Integer> getList() {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
            return list;
        }
    }
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.getList();

        System.out.println(collection.list1);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Potoc(collection,"1"));
        executorService.submit(new Potoc(collection,"2"));
        executorService.submit(new Potoc(collection,"3"));
        executorService.submit(new Potoc(collection,"4"));
        executorService.submit(new Potoc(collection,"5"));
        executorService.submit(new Potoc(collection,"6"));

        executorService.shutdown();

    }
    static class Potoc implements Runnable{
        Collection collection;
        String name;

        public Potoc(Collection collection,String name) {
            this.collection=collection;
            this.name = name;
            new Thread(this);
        }

        @Override
        public void run() {
            for (Integer p: collection.list1) {
                int x = p + 10;
                System.out.println(x);
            }
        }

    }

}
