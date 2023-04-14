package JC.While;
// Найти локальный максимум
import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        if (number1 == 0 || number2 == 0) {
            System.out.println("No local max");
            System.exit(1);
        }
        number3 = scanner.nextByte();
        if (number3 == 0) {
            System.out.println("No local max");
            System.exit(2);
        }
        int locMax = 0;
        if (number2>number1 && number2>number3)
            locMax +=1;

        while (number3!=0) {
            number1 = number2;
            number2 = number3;
            number3 = scanner.nextInt();
            if (number3 == 0)
                break;
            if (number2 > number1 && number2 > number3)
                locMax += 1;
        }
        System.out.println(locMax);
    }

}
