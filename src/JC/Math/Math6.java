package JC.Math;

import java.util.Scanner;
// Шахматы - конь
public class Math6 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        scanner.close();

        boolean ifBeat = false;

        if (Math.abs(x2 - x1) == 2&&Math.abs(y1 - y2)==1)
            ifBeat = true;
        else if (Math.abs(y1 - y2) == 2&&Math.abs(x1 - x2) == 2);

        if (ifBeat){
            System.out.println("Beat");
        }   else
            System.out.println("No Beating");


    }
}
