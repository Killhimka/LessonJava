package JC.Lesson;
// Определить четное ли 1е число и делится ли оно на второе
import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        if (a%2!=0){
            System.out.println("Неуспех");
        }   else if (a%b==0){
                System.out.println("Успех");
        }       else {
            System.out.println("Не");
        }



    }
}
