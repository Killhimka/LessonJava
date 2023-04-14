package JC.While.WhileHw;
//Наибольший делитель числа
import java.util.Scanner;

public class WhileHw2 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int count = number / 2;

        while (count<=number) {
            if (number % count == 0) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}

