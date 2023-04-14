package String.Practical;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractical5 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();

        str = str.replaceAll("x2","");
        str = str.replaceAll("x","");
        str = str.replaceAll(" ","");
        str = str.replaceAll("=0","");

        String[] strs = new String[3];
        strs = str.split("[+/]");

        int[] coefs = new int[3];

        for (int i = 0; i < strs.length; i++) {
            coefs[i] = Integer.valueOf(strs[i]);
        }
        System.out.println(Arrays.toString(coefs));

        int disc;
        disc = (int) Math.pow(coefs[1],2 ) -4*coefs[0]*coefs[2];

        int a = coefs[0];
        int b = coefs[1];
        int c = coefs[2];

        if (disc<0){
            System.out.println("No roots");
            System.exit(1);
        } else if (disc==0){
            int x1;
            x1 = (-b/(2*a*c));
            System.out.println("x = "+x1);
            System.exit(2);
        } else {
            double x1,x2;
            x1 = ((-b-Math.sqrt(disc))/(2*a*c));
            x2 = ((-b+Math.sqrt(disc))/(2*a*c));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        }
}
