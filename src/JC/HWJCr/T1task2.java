package JC.HWJCr;

import java.util.Scanner;

public class T1task2 {
    public static void main(String[] args) {
        int a1,b1,b2,a2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число по вертикали от 1-8: ");
        a1 = scanner.nextByte();
        System.out.print("Введите число по горизонтали от 1-8: ");
        b1 = scanner.nextByte();
        System.out.print("Введите число по горизонтали от 1-8: ");
        b2 = scanner.nextByte();
        System.out.print("Введите число по вертикали от 1-8: ");
        a2 = scanner.nextByte();
        scanner.close();

        if (a1<9 && b1==1 && b2<9 && a2==1){
            System.out.println("Можно");
        }  else {
            System.out.println("Ход невозможен");
        }



    }
}
