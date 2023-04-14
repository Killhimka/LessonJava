package JC.While.WhileHw;

import java.util.Scanner;

// Сумма квадратов последовательности
public class WhileHw4 {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (number!=0){
            sum += number*2;
            number = scanner.nextInt();
        }
        System.out.println("Sum = " +sum);
    }
}
