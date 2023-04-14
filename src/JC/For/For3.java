package JC.For;
// Числа деленные на 3 от 1 введенного до 2
import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        number1 = scanner.nextInt();
        System.out.println("Enter second number ");
        number2 = scanner.nextInt();
        scanner.close();

        int temp;
        if (number2<number1){
            temp = number2;
            number2 = number1;
            number1 = temp;
        }
        for (int i = number1; i <= number2 ; i++) {
            if (i%3==0)
                System.out.println(i + " ");
        }
    }
}
