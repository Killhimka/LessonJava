package ВводВывод.Hw;

import java.io.PrintWriter;
import java.util.Arrays;

public class Hw1 {
    public static void main(String[] args) {
        String str = "Доброго времени суток";
        String[] arrStr = str.split(" ");
        int sum = 0;

        for (String s: arrStr){
            System.out.println(s.length());
            System.out.printf("s = %d \n",s.length());
            System.out.println("s = " + s.length());

        }
    }
}
