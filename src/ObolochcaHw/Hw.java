package ObolochcaHw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        String[] str = "54 45".split(" ");
        int[] a = new int[str.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str[i]);
            b = a[0]+a[1];
        }



  //      System.out.println(Integer.parseInt(String.valueOf(b)));

    }
}
