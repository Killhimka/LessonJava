package JC.For;
// Таблица умножения
import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();



        for (int i = 1; i <= 9 ; i++) {
            System.out.println(i + " * " + number + " = " + number*i);
        }
    }
}
