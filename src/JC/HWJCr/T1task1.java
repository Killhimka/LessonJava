package JC.HWJCr;

import java.util.Scanner;

public class T1task1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        if (a==b & b==c & a==c){
            System.out.println("3");
        } else if (a==b || b==c || c==a){
            System.out.println("2");
        }   else {
                System.out.println("0");
        }




    }

}
