package Practical.String;
// �������� �����: ������� ����� ������� �� ��������� �������.
import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("����� ��������: "+str.length());
        System.out.print("������ 1 ������: ");
        int n = scanner.nextInt();
        System.out.print("������� 2 ������: ");
        int n1 = scanner.nextInt();
        int index = str.charAt(n-1);
        int index1 = str.charAt(n1-1);
        System.out.println("������ �� ������� "+ n +" "+ (char)index);
        System.out.println("������ �� ������� " + n1+" "+(char)index1);
    }
}
