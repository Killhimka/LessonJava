package Colection.Hw.HwComparator;

import java.util.*;

public class Hw {
    public static void main(String[] args) {
       Animal dog = new Animal("Dog", "black");
       Animal cat = new Animal("Cat","Green");
       Animal horse = new Animal("Horse","Read");
       Animal parrot = new Animal("Parrot","Green");
        List<Animal> al = new ArrayList(Arrays.asList(dog,cat,horse,parrot));
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,new Animal.coloreComparator());
        System.out.println(al);
    }
}
