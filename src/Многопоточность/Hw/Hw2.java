package Многопоточность.Hw;

public class Hw2 {
    static class ComRes {

          void Com() {
              int x = 0;
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s %d \n",Thread.currentThread().getName(),x);
                x++;
            }
        }
    }
static class Count implements Runnable{
        ComRes res;

    public Count(ComRes res) {
        this.res = res;
    }
    public void run(){
        res.Com();
    }
}
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            ComRes comRes = new ComRes();

            Thread thread = new Thread(new Count(comRes));
            thread.setName("Thread"+i);
            thread.start();
        }
    }
}
