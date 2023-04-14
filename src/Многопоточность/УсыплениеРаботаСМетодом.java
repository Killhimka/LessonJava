package ћногопоточность;

public class  ”сыпление–абота—ћетодом extends Thread {
    public  void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread1());
        ”сыпление–абота—ћетодом усыпление–абота—ћетодом = new ”сыпление–абота—ћетодом();
        /*System.out.println("Main Start");
        System.out.println("Main провер€ет состо€ние потока");
        System.out.println(thread.getState());
        System.out.println("Main запускает потока");
        thread.start();
        усыпление–абота—ћетодом.start();
        System.out.println("Main провер€ет состо€ние потока");
        System.out.println(thread.getState());
        System.out.println("Main ожидает конец работы потока");
        thread.join();
        System.out.println("Main провер€ет состо€ние потока");
        усыпление–абота—ћетодом.join();
        System.out.println(thread.getState());
        System.out.println("Main закончил работу");*/
        thread.start();
        усыпление–абота—ћетодом.start();
    }
    static class MyThread1 implements Runnable{
        public void run(){
            System.out.println("Thread Start");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-"+i);
            }
        }
    }
}
