package Practical.String;
// Количество символов от и до.
import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше строку: ");
        String str = scanner.nextLine();
        System.out.println("Введите с какого символа нужно узнать код, всего символов "+str.length()+" : ");
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        scanner.close();
        int index = str.codePointCount(n,n1);
        System.out.println("Вашь код : "+index);
    }
}
