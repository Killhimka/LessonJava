package JC.While;
// Найти 2ое повеличине значение из 3 цыфр
import java.util.Scanner;

public class While9 {
    public static void main(String[] args) {
        int max, preMax;
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        preMax = number;
        max = number;

        do {
            if (number >= max) {
                preMax = max;
                max = number;
            } else if (number >= preMax && number < max)
                preMax = number;
            number = scanner.nextInt();
        } while (number!=0);
        System.out.println(preMax);
    }
}



