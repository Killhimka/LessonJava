package Многопоточность.Hw;

import java.util.concurrent.Exchanger;

public class HwExchenger {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Mike(exchanger);
        new Mike.Info(exchanger);
    }
    static class Mike extends Thread{
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Примите заявку");
                sleep(1000);
                exchanger.exchange("Еще 1 пожалуйста");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        static class Info extends Thread{
            Exchanger<String> exchanger;

            public Info(Exchanger<String> exchanger) {
                this.exchanger = exchanger;
                start();
            }

            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    try {
                        System.out.println(exchanger.exchange(null));
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                /*System.out.println(exchanger.exchange(null));*/
            }
        }
    }
}
