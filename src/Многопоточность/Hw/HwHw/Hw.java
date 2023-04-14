package Многопоточность.Hw.HwHw;

public class Hw {
    public static void main(String[] args) {
        NeuThread neuThread = new NeuThread();
        NeuThread neuThread1 = new NeuThread();
        neuThread.start();
        neuThread1.start();
    }
    static class NeuThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        }
    }
}
