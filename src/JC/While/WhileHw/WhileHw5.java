package JC.While.WhileHw;

import java.util.Scanner;

public class WhileHw5 {
    public static void main(String[] args) {
        int number, power;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        power = scanner.nextInt();
        scanner.close();
        int temp = number;
        while (power!=1){
            number*=temp;
            power--;
        }
            System.out.println(number);

    }
}
