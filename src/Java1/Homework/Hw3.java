package Java1.Homework;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {

        int n1;
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        scanner.close();
        int number = n1%10 + n1/10%10 + n1/10/10%10 + n1/10/10/10%10 + n1/10/10/10/10%10;
        System.out.println(number);

    }
}
