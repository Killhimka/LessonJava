package String.HwString.HwString;
// Переводит введенные буквы верхнего регистра в нижний и наоборот
import java.util.Scanner;

public class HwString22 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        scanner.close();

        if (ch>=65&&ch<=90) {
            ch += 32;
            System.out.println(ch);
        }
           else if (ch>=97&&ch<=122) {
            ch -= 32;
            System.out.println(ch);
        }
          else
            System.out.println("В следующий раз попробуйте ввести букву. ");

    }
}
