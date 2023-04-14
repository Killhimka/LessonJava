package Java1.Lesson;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        int number, dex;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        dex = number/10%10;
        System.out.println(dex);
    }
}
