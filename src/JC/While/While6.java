package JC.While;

import java.util.Scanner;
// Определить является ли 1 число степенью 2
public class While6 {
    public static void main(String[] args) {
        int number, power;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        power = scanner.nextInt();
        scanner.close();

        while (number!=1) {
            if (number % power == 0) {
                number /= power;
            } else {
                System.out.println("No");
                System.exit(1);
            }
        }
        System.out.println("Yeas");
    }
}
