package ВводВывод.Hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        try {
            s = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Введите цифру");
        }
        int[] n = new int[s];

        int sum = 0;

        for (int i = 0; i < s; i++) {
           try {
               n[i] = scanner.nextInt();
           } catch (InputMismatchException inputMismatchException) {
               System.out.println("Ведите только цыфры");
           }
            sum += n[i];
        }
        System.out.println(sum);

    }
}
