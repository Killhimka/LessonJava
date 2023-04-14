package Многопоточность.Hw;

public class HwCинхронизация {
    public static void main(String[] args) throws InterruptedException {
        Potok potok = new Potok();
        potok.start();
        synchronized (potok) {
            potok.wait();
            System.out.println(potok.total-5 );
        }

    }

   static class Potok extends Thread{
       int total;
       @Override
       public void run() {
           synchronized (this) {
               for (int i = 0; i < 10; i++) {
                   total++;
               }
               System.out.println(total);
           }
           try {
               notify();
           } catch (IllegalMonitorStateException illegalMonitorStateException){

           }
       }
   }

}
