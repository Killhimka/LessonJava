package ����������;

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
                throw new ArithmeticException("� �� ����� ���� ������ ����");
            if (Math.pow(b,2)-4*a*c<0)
                throw new ArithmeticException("������������ ������ ����");
        }catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
    }
}
