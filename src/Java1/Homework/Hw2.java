package Java1.Homework;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        int number, dex;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        dex = number+1 + number%2;
        System.out.println(dex);

    }
}
