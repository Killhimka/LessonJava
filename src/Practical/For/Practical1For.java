package Practical.For;
// ��������� ����� % �� ������ ����� ������ � ����. ������ for.
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Practical1For {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);
        System.out.print("������� ����� ������: ");
        float sum = scanner.nextFloat();
        System.out.print("������� ���� ������ � �������: ");
        int mes = scanner.nextInt();


        for (int i = 0; i < mes; i++) {
            sum +=sum * 0.07;
        }
        System.out.printf("����� %d ������ ����� ������ ��������: %f ", mes,sum);
        in.close();

    }
}
