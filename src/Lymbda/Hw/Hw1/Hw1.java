package Lymbda.Hw.Hw1;
// калькулятор
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char c = scanner.next().charAt(0);
        int b = scanner.nextInt();
        scanner.close();
        Func func = (a1,c1,b1)-> {
            int sum1 = 0;
            switch (c1) {
                case '+':
                    sum1 = a1+b1;
                    break;
                case '-':
                    sum1=a1 - b1;
                    break;
                case '*':
                    sum1=a1 * b1;
                    break;
                case '/':
                    sum1=a1 / b1;
            }
            return sum1;
        };
        System.out.println(func.sum(a,c,b));
    }
}
