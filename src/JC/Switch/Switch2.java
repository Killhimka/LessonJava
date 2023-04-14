package JC.Switch;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        int a, b;
        char sign;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        sign = scanner.next().charAt(0);
        scanner.close();

        switch (sign){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Not correct sign");
        }
    }
}
