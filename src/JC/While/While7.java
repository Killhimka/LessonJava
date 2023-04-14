package JC.While;

import java.util.Scanner;

// Сумма последовательных чисел
public class While7 {
    public static void main(String[] args) {

        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (number!=0){
            sum += number;
            number = scanner.nextInt();
        }
        System.out.println("Sum = " +sum);
    }
}
