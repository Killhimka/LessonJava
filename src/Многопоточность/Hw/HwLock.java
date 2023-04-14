package ÃÌÓ„ÓÔÓÚÓ˜ÌÓÒÚ¸.Hw;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HwLock {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stroca stroca = new Stroca();
        Thread thread = new Thread(new Potoc(stroca,"1"));
        Thread thread1 = new Thread(new Potoc1(stroca,"2"));
        Thread thread2 = new Thread(new Potoc2(stroca,"3"));
        Thread thread3 = new Thread(new Potoc3(stroca,"4"));
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

    }
    public static class Stroca{
        Lock lock = new ReentrantLock();
        String str;

        public String getStr() {
            lock.lock();
            str = "‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡";
            lock.unlock();
            return str;

        }
    }
    static class Potoc implements Runnable{
        Stroca stroca;
        String name;

        public Potoc(Stroca stroca, String name) {
            this.stroca = stroca;
            this.name = name;
        }

        @Override
        public void run() {
            stroca.getStr().replace("‡","Ó");
            System.out.println(name+" "+stroca.getStr());
            System.out.println(stroca.getStr().replace("‡","j"));
        }
    }
    static class Potoc1 implements Runnable{
        Stroca stroca;
        String name;

        public Potoc1(Stroca stroca, String name) {
            this.stroca = stroca;
            this.name = name;
        }

        @Override
        public void run() {
            stroca.getStr().replace("‡","Ì");
            System.out.println(name+" "+stroca.getStr());
            System.out.println(stroca.getStr().replace("‡","f"));
        }
    }
    static class Potoc2 implements Runnable{
        Stroca stroca;
        String name;

        public Potoc2(Stroca stroca, String name) {
            this.stroca = stroca;
            this.name = name;
        }

        @Override
        public void run() {
            stroca.getStr().replace("‡","„");
            System.out.println(name+" "+stroca.getStr());
            System.out.println(stroca.getStr().replace("‡","s"));
        }
    }
    static class Potoc3 implements Runnable{
        Stroca stroca;
        String name;

        public Potoc3(Stroca stroca, String name) {
            this.stroca = stroca;
            this.name = name;
        }

        @Override
        public void run() {
            stroca.getStr().replace("‡","‚");
            System.out.println(name+" "+stroca.getStr());
            System.out.println(stroca.getStr().replace("‡","t"));
        }
    }
}
