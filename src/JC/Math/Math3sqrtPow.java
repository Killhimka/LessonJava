package JC.Math;
// �������� 2 ����� ����� ������� �������������� ������������: ������� ��������, � ����� ������� ������������
import java.util.Scanner;

public class Math3sqrtPow {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        int c;

        c = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);
        int P = a+b+c;

        int square = (int) (0.5*a*b);

        System.out.println("Perimetr"+P);
        System.out.println("Square,�������"+square);


    }
}
