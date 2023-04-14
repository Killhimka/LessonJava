package Colection;
// удаляет все нечетные цифры с массива
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class L4Iterator {
    public static void main(String[] args) {
       Integer[] arr ={2,8,7,6,9,3};
        LinkedList<Integer> ll = new LinkedList(Arrays.asList(arr));
        Iterator<Integer> iterator = ll.iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if (n%2!=0) {
                iterator.remove();
            }
        }
        System.out.println(ll);
    }
}
