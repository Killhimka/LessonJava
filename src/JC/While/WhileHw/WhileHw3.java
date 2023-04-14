package JC.While.WhileHw;

import java.util.Scanner;

public class WhileHw3 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        scanner.close();


        for (float i = number1; i <= number2 ; i++) {
            System.out.print(Math.pow(i,number2)+" ");
        }

    }
}
