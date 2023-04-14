package JC.While;
// Наибольший делитель 2 чисел
import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        scanner.close();

        int min;
        if (number1>number2){
            min = number2;
        }   else
            min = number1;


        while (min!=0){
            if (number1%min==0 && number2%min==0){
                System.out.println(min);
                break;
            }
            min -=1;


        }

    }
}
