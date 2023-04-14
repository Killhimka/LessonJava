package JC.While;
// Факториал
import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int count = 2;
        long fact = 1;

        while (count<=number){
            fact*=count;
            count++;
        }
        System.out.println(fact);
    }
}
