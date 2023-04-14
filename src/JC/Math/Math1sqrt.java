package JC.Math;
// Площадь треугольника
import java.util.Scanner;

public class Math1sqrt {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        int p, square;
        p = (a+b+c)/2;

        square = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println(square);
    }
}
