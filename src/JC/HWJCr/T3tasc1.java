package JC.HWJCr;

import java.util.Scanner;

// ������������� �����������
public class T3tasc1 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.print("����� x=: ");
        x = scanner.nextInt();
        System.out.print("����� y=: ");
        y = scanner.nextInt();
        System.out.print("���������� z=: ");
        z = scanner.nextInt();
        scanner.close();
        if (z==x+y){
            System.out.println("����� ����");
        }   else {
            System.out.println("������� ����");
        }


    }
}
