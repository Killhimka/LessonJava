package JC.For;
// Степени с помощью Match.pow
import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        long number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= number ; i++) {
            System.out.print(Math.pow(i,3)+" ");
        }
    }
}
