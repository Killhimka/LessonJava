package JC.HWJCr;

import java.util.Scanner;

public class T4tasc1 {
    public static void main(String[] args) {
        int hours1, min1, hours2, min2, hours3, min3;
        Scanner scanner = new Scanner(System.in);
        hours1 = scanner.nextInt();
        min1 = scanner.nextInt();
        hours2 = scanner.nextInt();
        min2 = scanner.nextInt();
        hours3 = scanner.nextInt();
        min3 = scanner.nextInt();
        scanner.close();
        int h = (hours1*60+min1)+(hours3*60+min3), a = hours2*60+min2;
        if (a<h){
            System.out.println("Вы неуспеете");
        }   else {
            System.out.println("Вы успеете");
        }


    }
}
