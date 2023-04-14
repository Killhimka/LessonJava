package Обопщение;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3, 4,5,6,7};
        if (isIn(12,arr))
            System.out.println("Yas");
        else System.out.println("No");
        if (isIn(5,arr))
            System.out.println("Yas");
        else System.out.println("No");

        String str = "Все это не важно";
        String [] strArr = str.split(" ");
        if (isIn("не",strArr))
            System.out.println("Yas");
        else System.out.println("No");
    }
    public static <T,Y> boolean isIn(T x,Y[]array){
        for (Y element: array){
         if (x.equals(element))
            return true;
        }
        return false;
    }
}

