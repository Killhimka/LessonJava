package JC.Math;
// Шахматы - ход ладьи
import java.util.Scanner;

public class Math5 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        scanner.close();

        if (x1 == x2 || y1 == y2)
            System.out.println("Beat");
            else
            System.out.println("No beating");

    }
}
