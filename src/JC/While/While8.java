package JC.While;
// Максимальная цыфра из введенных
import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        int number;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        while (number!=0){
            if (number<max)
                max = number;
            number = scanner.nextInt();
        }
        System.out.println(max);


    }
}

