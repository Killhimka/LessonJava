package Practical.For;

import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("������ ���� ������ �����: ");
            int n1 = scanner.nextInt();
            System.out.print("������� ������ �����: ");
            int n2 = scanner.nextInt();
            System.out.println(n1*n2);

            System.out.print("��� ������ �� ���������� ������� 0, ��� ����������� ����� ������ �����: ");
            n = scanner.nextInt();

        } while (n!=0);
        scanner.close();
        System.out.println("Bay,bay");
    }
}
