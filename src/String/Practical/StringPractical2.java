package String.Practical;
// ���� �������� ������� �������� ��������� � �������
import java.util.Scanner;

public class StringPractical2 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        scanner.close();

        ch -=32;
        System.out.println(ch);
    }
}
