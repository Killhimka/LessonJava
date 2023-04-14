package JC.While.WhileHw;
// ÷ыкл чисел в квадрате до введенного
import java.util.Scanner;

public class WhileHw1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int count = 1;
        long fact;

        while (count*count<=number) {
            fact = ((long) count * count);
            System.out.println(fact);
            count++;
        }
    }
}
