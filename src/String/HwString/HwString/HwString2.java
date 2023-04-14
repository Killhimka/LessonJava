package String.HwString.HwString;
// Определяет число это или нет и четное или нет
import java.util.Scanner;

public class HwString2 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        scanner.close();

        if (ch>=48&&ch<=57) {
            if (ch % 2 == 0) {
                System.out.println("Введенная цыфра четная");
            } else
                System.out.println("Введенная цыфра нечетная");
        }   else
            System.out.println("Не является цыфрой");
    }
}
