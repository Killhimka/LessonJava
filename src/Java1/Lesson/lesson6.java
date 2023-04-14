package Java1.Lesson;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
        int speed, time, distance;
        Scanner scanner = new Scanner(System.in);
        speed = scanner.nextInt();
        time = scanner.nextInt();
        scanner.close();
        distance = speed*time;
        System.out.println("пройденое растояние: " + distance);
    }
}
