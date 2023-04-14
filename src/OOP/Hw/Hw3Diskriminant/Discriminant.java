package OOP.Hw.Hw3Diskriminant;

import java.util.Scanner;

public class Discriminant {
    Scanner scanner = new Scanner(System.in);
    int a,b,c;
    int disc;
    void setDisc(){
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        disc = (int) Math.pow(b,2) - 4*a*c;
        System.out.println(disc);
        if (disc<0) {
            System.out.println("No roots");
            System.exit(1);
        }
        else if (disc==0){
            int x1;
            x1 = -b/(4*a*c);
            System.out.println("Root: " + x1);
            System.exit(1);
        }   else {
            int x1, x2;
            x1 = (int) (-b-Math.sqrt(disc))/(4*a*c);
            x2 = (int) ((-b+Math.sqrt(disc))/(4*a*c));
            System.out.println(x1+ " " +x2);
        }
    }
}
