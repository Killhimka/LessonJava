package �����;

import java.io.FileInputStream;
import java.io.IOException;

public class Lesson2 {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream("d:/Files/�����1/a.txt")){
            System.out.println("����� ���������� ��������� ������ "+(size = f.available()));
            int n = size/110;
            System.out.println("������ " +n+ " ������, "+" ����������� �� ����� �� ������� ������� read()");
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println("\n ��� ��� ��������: "+f.available());
            System.out.println("������ ��������� "+n+" ������ �� ������� ������� read(b[])");
            byte[]b = new byte[n];
            if (f.read(b)!=n){
                System.out.println("������ ���������" +n+ " ������");
            }
            System.out.println(new String(b,0,n));
            System.out.println("\n ��� ��� ��������: "+(size=f.available()));

            System.out.println("������ "+n/2+" ������, ����������� � ����� �������");

            if (f.read(b,n/2,n/2)!=n/2){
                System.out.println("������ ��������� "+n/2+" ������.");
            }
            System.out.println(new String(b,0,b.length));
            System.out.println("\n ��� ��� ��������: "+f.available());
        } catch (IOException e) {
            System.out.println("������"+e);
        }
    }
}
