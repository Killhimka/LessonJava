package Многопоточность.Hw.HwHw;

import java.util.*;
import java.util.concurrent.Semaphore;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        Books books = new Books();
        books.getHashBook();
        Semaphore semaphore = new Semaphore(7);
        Person persons = new Person(books);
        for (int i = 0; i < 60; i++) {
            Person person = new Person(books);
            person.semaphore=semaphore;
            person.start();
        }
        persons.getList1();

        System.out.println(books.hashBook);
        System.out.println(persons.list1);

    }
    // Книги -----------------------------------------------------------
    static class Books{
        List<Integer> hashBook = new LinkedList<>();
        List<Integer> hashBook1 = Collections.synchronizedList(hashBook);
        int sumBook = 100;
        public List<Integer> getHashBook() {
            for (int i = 1; i <= sumBook; i++) {
                hashBook.add(i);
            }
            System.out.println(hashBook);
            return hashBook;
        }
    }
    // Читатели-----------------------------------------------------------------
    static class Person extends Thread {
        Semaphore semaphore;
        Books books;
        List <Integer> list = new LinkedList<>();
        List<Integer> list1 = Collections.synchronizedList(list);
        int[] book = new int[3];

        public List<Integer> getList1() {
            for (Integer j: list1)
                System.out.println(j);
            return list1;
        }

        public Person(Books books  ) {
            this.books = books;

        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
            for (int i = 0; i < 3; i++) {
                book[i] = books.hashBook1.remove((int) (Math.random() * books.hashBook1.size()));
                list1.add(book[i]);
            }
            System.out.println(Arrays.toString(book)+" "+getName());
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 3; i++) {
                books.hashBook1.add(book[i]);
                Collections.sort(books.hashBook1);

            }
            System.out.println(Arrays.toString(book)+" "+getName());
            semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
