package Colection.Hw.Hw3;
// Сортирует коробки с определенным весом по массивам
import Colection.Hw.Hw.HeavyBox;

import java.util.*;

public class Hw {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(200);
        HeavyBox box2 = new HeavyBox(280);
        HeavyBox box3 = new HeavyBox(320);
        HeavyBox box4 = new HeavyBox(380);
        LinkedList<HeavyBox> list1 = new LinkedList(Arrays.asList(box1,box2,box3,box4));
        LinkedList<HeavyBox> list2 = new LinkedList();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getWeight() > 300)
                list2.add(list1.get(i));
        }
        list1.removeIf(heavyBox -> heavyBox.getWeight()>300);
        System.out.println(list1);
        System.out.println(list2);
    }
}
