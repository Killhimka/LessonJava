package Practical.For;
// ��������� ����� % �� ������ ����� ������ � ���� ������ While.
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Practical1While {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);
        System.out.print("������� ����� ������: ");
        float sum = scanner.nextFloat();
        System.out.print("������� ���� ������ � �������: ");
        int mes = scanner.nextInt();
        int i = mes;
        while (i>0){
            sum +=sum * 0.07;
            i--;
        }
        System.out.printf("����� %d ������ ����� ������ ��������: %f ", mes,sum);
        in.close();

    }
}
