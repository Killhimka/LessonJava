package JC.While;

import java.util.Scanner;
// Вывод чисел по порядку до введенного
public class While1 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        int count = 1;
        while (count!=number){
            System.out.println(count);
            count++; //  +=1
        }

    }
}
