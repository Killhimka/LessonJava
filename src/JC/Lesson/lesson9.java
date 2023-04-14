package JC.Lesson;

import java.util.Scanner;

public class lesson9 {
    public static void main(String[] args) {
        int n, m, x, y;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();

        if (x>=n/2)
            x = n-x;
        if (y>=n/2)
            y = n-y;

        if (x<y){
            System.out.println("Растояние до ближайшего бортика = " + x);
        }   else{
            System.out.println("Растояние до ближайшего бортика = " + y);
        }


    }
}
