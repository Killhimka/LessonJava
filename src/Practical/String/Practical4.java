package Practical.String;
// Сравнить суммы юникода 1 строки со 2.
import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        int result = str1.compareTo(str2);
        if (result<0) System.out.println(result+" Сумма юникода 1 строки меньше 2 строки.");
        else if (result==0) System.out.println(result+" Суммы юникода равны");
        else System.out.println(result+" Сумма юникода 1 строки больше 2 строки.");
    }
}
