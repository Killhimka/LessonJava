package JC.Math;
// �������� ��������� ����� n: �������� ��������� ����� �� -n �� n
import java.util.Scanner;

public class Math4Random {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int randNumber;

        randNumber = (int) ((Math.random() * number) - number);

        System.out.println(randNumber);

    }
}
