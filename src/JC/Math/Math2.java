package JC.Math;
// Дискриминант уравнение ax2+bx+c=0
import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        int disc = (int) Math.pow(b,2) - 4*a*c;

        if (disc<0) {
            System.out.println("No roots");
            System.exit(1);
        }
        else if (disc==0){
            int x1;
            x1 = -b/(4*a*c);
            System.out.println("Root: " + x1);
            System.exit(1);
        }   else {
            int x1, x2;
            x1 = (int) (-b-Math.sqrt(disc))/(4*a*c);
            x2 = (int) ((-b+Math.sqrt(disc))/(4*a*c));
            System.out.println(x1+ " " +x2);
        }
    }
}
