package Practical.String;
// Введите строку и выберите символы юникод которых вы хотите узнать.
import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        System.out.print("Введите ваши символы: ");
        String str = scanner.nextLine();
        do {
            System.out.print("Выберите юникод какого символа вы бы хотили узнать от 1 до " + str.length()+" : ");
            int n = scanner.nextInt();
            int index = str.codePointBefore(n);
            System.out.println(" "+index);

            System.out.print("При нажатии на 0 программа завершит работу! ");
            n1 = scanner.nextInt();
        }
            while (n1!=0);
            scanner.close();
        }
}
