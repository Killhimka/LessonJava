package JC.For;

import java.util.Scanner;

// �������� 4 �������� ����� �� �������
public class For4 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 1000; i*=10) {
            System.out.println((number/i)%10);
        }
    }
}
