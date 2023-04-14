package JC.While;
// Наименьший делитель числа
import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int count = 2;

        while (count<=number){
            if (number%count==0){
                System.out.println(count);
                break;
            }
            count++;

        }
    }
}
