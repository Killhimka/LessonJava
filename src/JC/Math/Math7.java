package JC.Math;
// Шахматы ход слона (офицер)
import java.util.Scanner;

public class Math7 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        scanner.close();

        if (Math.abs(x1 - x2)==Math.abs(y1 - y2))
            System.out.println("Beat");
        else
            System.out.println("No Beating");


    }
}
