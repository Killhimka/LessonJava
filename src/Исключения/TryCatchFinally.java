package Исключения;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        try {
            System.out.println(a/b);
        } catch (ArithmeticException arithmeticException){
            System.out.println("Вы пытаетесь разделить на ноль");
        } finally {
            System.out.println(1);
        }
    }
}
