package Java1.Lesson;

import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        scanner.close();
        int p1, p2, p3;
        p1 = n1/2 + n1%2;
        p2 = n2/2 + n2%2;
        p3 = n3/2 + n3%2;
        System.out.println("Количество парт на класс " + p1 +" " +p2 +" " +p3);
        System.out.println("Всего парт на школу " + (p1+p2+p3));
    }
}
