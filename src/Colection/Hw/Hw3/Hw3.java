package Colection.Hw.Hw3;

import Colection.Hw.Hw.HeavyBox;

import java.util.LinkedList;
import java.util.ListIterator;

public class Hw3 {
    static LinkedList<HeavyBox> list1 = new LinkedList<>();
    static LinkedList<HeavyBox> list2 = new LinkedList<>();
    private static void boxResize(LinkedList<HeavyBox> box1, LinkedList<HeavyBox> box2){
        ListIterator<HeavyBox>iterator = box1.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().getWeight()>300){
                box2.add(iterator.previous());
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(200);
        HeavyBox box2 = new HeavyBox(280);
        HeavyBox box3 = new HeavyBox(320);
        HeavyBox box4 = new HeavyBox(380);
        list1.add(box1);
        list1.add(box2);
        list1.add(box3);
        list1.add(box4);
        boxResize(list1,list2);
        System.out.println("List 1");
        for (HeavyBox b: list1){
            System.out.println(b);
        }
        System.out.println("List 2");
        for (HeavyBox b: list2){
            System.out.println(b);
        }
    }
}
