package Lymbda.Lesson3;
// Проверяет введена 1 буква маленькая или заглавня
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();
        Func func = (str1) -> {
            char[] chars = str1.toCharArray();
            if (chars[0]>=65&&chars[0]<=90)
                return true;
            return false;
        };
        if (func.firstLater(str))
            System.out.println("It is big latter");
        else System.out.println("It is small latter");
    }
}
