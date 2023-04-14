package JC.For.ForHw;

import java.util.Scanner;

public class ForHw1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 0; i <= number; i+=2) {
                sum += i;
        }
        System.out.println(sum);

    }
}
