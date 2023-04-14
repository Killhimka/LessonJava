package OOP.Hw.Hw5Discriminant;

import java.util.Scanner;

public class Discriminant {
    int a;
    int b;
    int c;
    int disc;

    public Discriminant(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Disc () {
        System.out.println("������ ����������� ��������� ����:");
        System.out.println("ax^2 - bx + c = 0");
        disc = b * b - 4 * a * c;
        if (disc < 0){
            System.out.println("��� ������.");
        System.exit(1);
    } else if (disc==0) {
            int x = -b / (2*a);
            System.out.println("� ��������� 1 ������: x = " + x);
        }else {
            double x1 = (-b - Math.sqrt(disc)) / (2*a);
            double x2 = (-b + Math.sqrt(disc)) / (2*a);
            System.out.println("����� ���������: x1 = " + x1 + ", x2 = "+x2);
        }


    }

}
