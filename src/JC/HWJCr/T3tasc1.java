package JC.HWJCr;

import java.util.Scanner;

// прямоугольный треугольник
public class T3tasc1 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Катет x=: ");
        x = scanner.nextInt();
        System.out.print("Катет y=: ");
        y = scanner.nextInt();
        System.out.print("Гипотинуза z=: ");
        z = scanner.nextInt();
        scanner.close();
        if (z==x+y){
            System.out.println("Может быть");
        }   else {
            System.out.println("Неможет быть");
        }


    }
}
