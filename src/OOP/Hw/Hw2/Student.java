package OOP.Hw.Hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private Scanner scanner = new Scanner(System.in);
    private String family;
    private String name;
    private int[] n = new int[5];
    private float evaluation;

    void setEvaluation() {
        do {
            System.out.print("���� ���: ");
            name = scanner.nextLine();
        } while (name != name);
        System.out.print("���� �������: ");
        family = scanner.nextLine();
        System.out.print("������� ���� 5 ������: ");
        for (int i = 0; i < 5; i++) {
            n[i] = scanner.nextInt();
            evaluation += n[i];

        }
    }

    @Override
    public String toString() {
        return "�������(��): " + name+" "+family+ " �� ������� ������ "
                +evaluation/5+" ���� ������ �������, �������� ������.";
    }
}
