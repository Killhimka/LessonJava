package �����.Hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sdfg {
    public static void main(String[] args) {
        int c;
        String a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���: ");
        a = scanner.nextLine();
        System.out.println("������� ���� �������: ");
        b= scanner.nextLine();
        System.out.println("������� ��� ����� ��������: ");
        c = scanner.nextInt();
        scanner.close();

        System.out.printf("������������ ����� %s ",a);
        System.out.printf("������� ������������ %s ",b);
        System.out.printf("����� �������� %d ",c);

    }

}
