package Colection.Hw.HwHashMap;

import Colection.Hw.HwComparator.Animal;

import java.util.Comparator;

public abstract class Comp implements Comparable<HwHashMap> {

    @Override
    public int compareTo(HwHashMap o) {
        return this.toString().compareTo(o.toString());
    }

}
