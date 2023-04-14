package Practical.String;
// Вводится текст: вывести буквы стоящие на выбранных номерах.
import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Всего символов: "+str.length());
        System.out.print("Ведите 1 символ: ");
        int n = scanner.nextInt();
        System.out.print("Введите 2 символ: ");
        int n1 = scanner.nextInt();
        int index = str.charAt(n-1);
        int index1 = str.charAt(n1-1);
        System.out.println("Символ на позиции "+ n +" "+ (char)index);
        System.out.println("Символ на позиции " + n1+" "+(char)index1);
    }
}
