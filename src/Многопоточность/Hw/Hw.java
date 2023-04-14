package Многопоточность.Hw;



import javax.sql.rowset.Joinable;
import java.util.Date;
import java.util.Scanner;

public class Hw {
     static class Metod{
         Scanner scanner = new Scanner(System.in);
         int n = 1000;
         synchronized void Met(){
            for (int i = 0; i <100 ; i++) {
                n--;
                System.out.printf("%s %d \n",Thread.currentThread().getName(),n);
            }
        }
    }
     static class Potoc2 extends Thread{
         Metod metod;
         public Potoc2(Metod metod){
             this.metod=metod;
         }
         public void run(){
             metod.Met();
         }
}
    public static void main(String[] args) throws InterruptedException {
        Metod metod = new Metod();
        Potoc2 potoc2 = new Potoc2(metod);
        Thread thread = new Thread(new Potoc1(metod));
        thread.start();
        potoc2.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                metod.Met();
                Date date= new Date();
                System.out.println(date);
            }
        }).start();
        new Thread(()-> metod.Met()).start();
    }
    static class Potoc1 implements Runnable {
        Metod m;

        public Potoc1(Metod m) {
            this.m = m;
        }

        public void run(){
            m.Met();
        }
    }
}
