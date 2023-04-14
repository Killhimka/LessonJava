package JC.Math.MathHw;
// Линейное уравнение ax+b=0: вычислите X
import java.util.Scanner;

public class MathHw2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner =new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        if (a==0){
            System.out.println("a=0");
        }   else {
            int x = -b/a;
            System.out.println("x= "+x);
        }

    }
}
