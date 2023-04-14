package Practical.For;
// ¬ычислите сумму % за каждый мес€ц вклада в банк. ÷ыклом for.
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Practical1For {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);
        System.out.print("¬ведите сумму вклада: ");
        float sum = scanner.nextFloat();
        System.out.print("¬ведите срок вклада в мес€цах: ");
        int mes = scanner.nextInt();


        for (int i = 0; i < mes; i++) {
            sum +=sum * 0.07;
        }
        System.out.printf("ѕосле %d мес€ца сумма вклада составит: %f ", mes,sum);
        in.close();

    }
}
