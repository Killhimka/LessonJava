package Lymbda.lesson;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Oper oper = (int x, int y) ->{
            System.out.println(x+y);
            System.out.println(a);
        };

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        oper.calculate(x,y);
/*один два три */
    }
}
