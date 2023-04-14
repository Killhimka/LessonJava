package JC.Lesson;

import java.util.Scanner;
// Определение 1 или 2 введенное число больше
public class lesson4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        if (a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
