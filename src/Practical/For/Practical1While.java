package Practical.For;
// ¬ычислите сумму % за каждый мес€ц вклада в банк циклом While.
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Practical1While {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);
        System.out.print("¬ведите сумму вклада: ");
        float sum = scanner.nextFloat();
        System.out.print("¬ведите срок вклада в мес€цах: ");
        int mes = scanner.nextInt();
        int i = mes;
        while (i>0){
            sum +=sum * 0.07;
            i--;
        }
        System.out.printf("ѕосле %d мес€ца сумма вклада составит: %f ", mes,sum);
        in.close();

    }
}
