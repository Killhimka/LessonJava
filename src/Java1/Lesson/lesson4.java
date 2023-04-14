package Java1.Lesson;

import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        int n, k, z;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        z = scanner.nextInt();
        scanner.close();
        int a;
        a = (n*100+k)*z;
        n = a/100;
        k = a%100;
        System.out.println("Количество рублей " +n);
        System.out.println("Количество копеек " +k);
    }
}
