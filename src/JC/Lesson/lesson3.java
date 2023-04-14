package JC.Lesson;

import java.util.Scanner;

// Шахматы определение черной и белой клетки
public class lesson3 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();
        int sun = x+y;
        if (sun%2==0){
            System.out.println("Данная клетка - белая");
        }   else {
            System.out.println("данная клетка - черная");
        }
    }
}
