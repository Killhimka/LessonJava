package Java1.Lesson;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        int number, dex;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        dex = number+2 - number%2;
        System.out.println(dex);
    }
}
