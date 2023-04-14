package Colection.Hw.Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Hw {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(200);
        HeavyBox box2 = new HeavyBox(400);
        HeavyBox box3 = new HeavyBox(600);
        HeavyBox box4 = new HeavyBox(800);

        ArrayList <HeavyBox> al = new ArrayList(Arrays.asList(box1,box2,box3,box4));
        al.forEach(System.out::println);

        al.get(0).weight = 201;
        al.forEach(System.out::println);

        al.remove(al.size()-1);
        System.out.println(al);

        HeavyBox[] arr1 = al.toArray(new HeavyBox[0]);
            System.out.println(Arrays.toString(arr1));

        HeavyBox[] arr2 = new HeavyBox[al.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = al.get(i);
        }
        System.out.println(Arrays.toString(arr2));

        HeavyBox[] arr3 = al.stream().toArray(HeavyBox[]::new);
        System.out.println(Arrays.toString(arr3));

        al.clear();
        System.out.println(al);

    }
}
