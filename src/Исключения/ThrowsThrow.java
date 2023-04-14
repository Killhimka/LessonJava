package Исключения;

import java.util.Scanner;

public class ThrowsThrow {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        Scanner scanner= new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        try {
            if (a<0)
                throw new ArithmeticException("А не может быть меньше нуля");
            if (Math.pow(b,2)-4*a*c<0)
                throw new ArithmeticException("Дискриминант меньше нуля");
        }catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
    }
}
