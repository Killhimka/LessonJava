package Исключения;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int a=0,b = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Вы ввели букву, а нужно цифру");
        }
        try {
            System.out.println(a/b);
        } catch (ArithmeticException arithmeticException){
            System.out.println("На ноль делить нельзя");
        } catch (Exception e){

        }
    }
}
