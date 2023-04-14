package JC.HWJCr;

import java.util.Scanner;

public class DZmash {
    public static void main(String[] args) {
        int n, a;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        scanner.close();

        int numRandom;

        numRandom = (int) ((Math.random() * n) - n );

        if (n<a) {
        }    System.out.println(Math.round(Math.random()*10));




    }
}
