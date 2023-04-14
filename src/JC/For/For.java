package JC.For;
// Факториал
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        long fact =1;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n==0){
            System.out.println(fact);
            return;
        }   else {
            for (int i = 1; i<=n; i++){
                fact *=i;
            }
        }
        System.out.println(fact);
    }
}
