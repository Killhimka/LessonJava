package Colection.Hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class HwListIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(Arrays.asList("A","B","C","D"));
        ListIterator<String> li = al.listIterator();
        while (li.hasNext()){
            String element = li.next();
            li.set(element + " +");
        }
        while (li.hasPrevious()){
            String element = li.previous();
            System.out.println(element +" ");
            li.remove();
        }

            System.out.println(al.isEmpty());

    }
}
