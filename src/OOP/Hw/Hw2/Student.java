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
            System.out.print("Ваше Имя: ");
            name = scanner.nextLine();
        } while (name != name);
        System.out.print("Ваша Фамилия: ");
        family = scanner.nextLine();
        System.out.print("Введите ваши 5 оценок: ");
        for (int i = 0; i < 5; i++) {
            n[i] = scanner.nextInt();
            evaluation += n[i];

        }
    }

    @Override
    public String toString() {
        return "Студент(ка): " + name+" "+family+ " со средним баллом "
                +evaluation/5+" ваша заявка принята, ожидайте ответа.";
    }
}
