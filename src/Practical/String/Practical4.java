package Practical.String;
// �������� ����� ������� 1 ������ �� 2.
import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        int result = str1.compareTo(str2);
        if (result<0) System.out.println(result+" ����� ������� 1 ������ ������ 2 ������.");
        else if (result==0) System.out.println(result+" ����� ������� �����");
        else System.out.println(result+" ����� ������� 1 ������ ������ 2 ������.");
    }
}
