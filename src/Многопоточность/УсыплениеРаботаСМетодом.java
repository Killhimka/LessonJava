package ���������������;

public class  ����������������������� extends Thread {
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
        ����������������������� ����������������������� = new �����������������������();
        /*System.out.println("Main Start");
        System.out.println("Main ��������� ��������� ������");
        System.out.println(thread.getState());
        System.out.println("Main ��������� ������");
        thread.start();
        �����������������������.start();
        System.out.println("Main ��������� ��������� ������");
        System.out.println(thread.getState());
        System.out.println("Main ������� ����� ������ ������");
        thread.join();
        System.out.println("Main ��������� ��������� ������");
        �����������������������.join();
        System.out.println(thread.getState());
        System.out.println("Main �������� ������");*/
        thread.start();
        �����������������������.start();
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
