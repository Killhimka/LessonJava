package String.Practical;
// Определить является ли введенный символ цыфрой или нет с помощью юникода
import java.util.Scanner;

public class StringPractical1 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner =new Scanner(System.in);
        ch = scanner.next().charAt(0);
        scanner.close();

        if (ch>=48&&ch<=57)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
