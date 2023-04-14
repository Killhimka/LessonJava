package JC.For.ForHw;

import java.util.Scanner;

public class rtherher {
    public static void main(String[] args) {
        int number1, number2, number3, number4;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt() ;
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        number4 = scanner.nextInt();
        scanner.close();


            if (number1>number2 && number2>number3 && number3>number4){
                number1 = number2;
                number2 = number3;
                number3 = number4;
                number4 = number1;
            }
        System.out.println(number1 | number2 | number3 | number4);






    }
}
