package JC.Math;

import java.util.Scanner;

public class Math9 {
    public static void main(String[] args) {
        int a,b;
        int degree;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        degree = scanner.nextInt();
        scanner.close();

        int square;
        square = (int) ( 0.5*a*b*Math.sin(Math.toRadians(degree)));

        System.out.println("Squere "+square);
    }
}
