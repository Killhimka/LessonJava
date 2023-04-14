package JC.For;

import java.util.Scanner;

// Факториал
public class For1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int fact = 1;

        for (int i = 2; i <= number; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
