package Practical.String;
// ������� ������ � �������� ������� ������ ������� �� ������ ������.
import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        System.out.print("������� ���� �������: ");
        String str = scanner.nextLine();
        do {
            System.out.print("�������� ������ ������ ������� �� �� ������ ������ �� 1 �� " + str.length()+" : ");
            int n = scanner.nextInt();
            int index = str.codePointBefore(n);
            System.out.println(" "+index);

            System.out.print("��� ������� �� 0 ��������� �������� ������! ");
            n1 = scanner.nextInt();
        }
            while (n1!=0);
            scanner.close();
        }
}
