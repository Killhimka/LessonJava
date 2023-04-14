package Java1.Homework;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        float distance, speed, time;
        Scanner scanner = new Scanner(System.in);
        distance = scanner.nextInt();
        speed = scanner.nextInt();
        scanner.close();
        time = distance/speed;
        System.out.println("Путь составит: " +time+ "мин.");

    }
}
