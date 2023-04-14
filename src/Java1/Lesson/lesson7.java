package Java1.Lesson;

import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        int distance, riverSpeed, speed;
        Scanner scanner = new Scanner(System.in);
        distance = scanner.nextInt();
        riverSpeed = scanner.nextInt();
        speed = scanner.nextInt();
        scanner.close();
        int time;
        time = distance/(riverSpeed+speed);
        time += distance/(speed-riverSpeed);
        System.out.println("Время равно: " +time+ "часов");

    }
}
