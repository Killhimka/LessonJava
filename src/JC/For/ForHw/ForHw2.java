package JC.For.ForHw;
// Возведение в степень
import java.util.Scanner;

public class ForHw2 {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        scanner.close();

        long sum = 1;

        for (int i = 1; i <= number2; i++) {
            sum*=number1;
        }
        System.out.println(sum);
    }
}
