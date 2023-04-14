package Colection.Hw;

import java.util.ArrayDeque;

public class HwArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();
        ad.add("France");
        ad.add("Spain");
        ad.add("Italy");
        System.out.println(ad);
        ad.addLast("India");
        ad.addFirst("Brazil");
        System.out.println(ad);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

    }
}
