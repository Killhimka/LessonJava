package Java1.Lesson;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.println("Введите растояние в км");
        a = scanner.nextInt();
        System.out.println("Ведите время в минутах");
        b = scanner.nextInt();
        scanner.close();
        float count = a/b*60;
        System.out.println("Скорость км/ч " +count);

    }
}
