package Многопоточность.Hw.HwКораблиИПорты;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Verf1 {
    private List<String> name = Collections.synchronizedList(
            new ArrayList(Arrays.asList("Banana","Bread", "Cloches")));
    private List<Integer> weight = Collections.synchronizedList(new ArrayList<>(Arrays.asList(10,30,50)));

    List<String> nameShip = Collections.synchronizedList(new ArrayList<>());
    List<Integer> weightShip = Collections.synchronizedList(new ArrayList<>());

    public void Ship () {
        for (int i = 0; i < 100; i++) {
            nameShip.add(name.get((int) (Math.random() * name.size())));
            weightShip.add(weight.get((int) (Math.random() * weight.size())));
        }
        /*System.out.println(nameShip);
        System.out.println(weightShip);*/
    }
}
