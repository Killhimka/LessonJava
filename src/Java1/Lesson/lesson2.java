package Java1.Lesson;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.println("������� ��������� � ��");
        a = scanner.nextInt();
        System.out.println("������ ����� � �������");
        b = scanner.nextInt();
        scanner.close();
        float count = a/b*60;
        System.out.println("�������� ��/� " +count);

    }
}
