package Practical.String;
// ���������� �������� �� � ��.
import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� ������: ");
        String str = scanner.nextLine();
        System.out.println("������� � ������ ������� ����� ������ ���, ����� �������� "+str.length()+" : ");
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        scanner.close();
        int index = str.codePointCount(n,n1);
        System.out.println("���� ��� : "+index);
    }
}
