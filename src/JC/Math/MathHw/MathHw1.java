package JC.Math.MathHw;
// Случайные числа от введенно до введенного, введенное количество раз.
import java.util.Scanner;

public class MathHw1 {
    public static void main(String[] args) {
       int n, n1,n2;
       Scanner scanner = new Scanner(System.in);
       n = scanner.nextInt();
       n1 = scanner.nextInt();
       n2 = scanner.nextInt();
       scanner.close();
        for (int i = 0; i < n2; i++) {
            System.out.print(" "+(int) (Math.random()*((n1-n)+1)+n));
        }
    }
}
