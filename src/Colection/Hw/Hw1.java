package Colection.Hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{5,3,4,9,6,6,5,7,1,3,5,4,6,6,6,8,5,5,5,4,9,9,8,8,8,8,8};
        ArrayList arrayList = new ArrayList();
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            int x = (int) arrayList.get(i);
            if (x % 2 == 0)
            list.add(x);
            else list1.add(x);
        }
        System.out.println(list);
        System.out.println(list1);

        if (list.size()> list1.size()) {
            System.out.println("Четных больше.");
        } else System.out.println("Нечетных больше.");

        }


}
