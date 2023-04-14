package JC.HWJCr;
// Вычисление 1 нечетного числа
import java.util.Scanner;

public class T2task1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        if (a%2!=0){
            System.out.println(1);
        }   else if (b%2!=0){
            System.out.println(2);
        }       else {
            System.out.println(3);
        }
    }
}
