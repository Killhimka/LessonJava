package Многопоточность;

public class ТретийВариантСозданияПотока {
    public static void main(String[] args) {
         new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
            }
        }).start();
         new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 1000; i > 0; i--) {
                     System.out.println(i);
                 }
             }
         }).start();
    }
}
