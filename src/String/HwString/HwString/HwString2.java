package String.HwString.HwString;
// ���������� ����� ��� ��� ��� � ������ ��� ���
import java.util.Scanner;

public class HwString2 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        scanner.close();

        if (ch>=48&&ch<=57) {
            if (ch % 2 == 0) {
                System.out.println("��������� ����� ������");
            } else
                System.out.println("��������� ����� ��������");
        }   else
            System.out.println("�� �������� ������");
    }
}
