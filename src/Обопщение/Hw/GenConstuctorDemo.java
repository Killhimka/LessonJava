package Обопщение.Hw;

import java.util.Objects;

public class GenConstuctorDemo {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        int i = 4;
        GenConstructor genConstructor = new GenConstructor<>(arr, 5);
        genConstructor.Ave();
        System.out.println(genConstructor.Ave());

    }
}
class GenConstructor<T,Y> {
    private T[] arr;
    private Y number;

    public  GenConstructor(T[] arr, Y number) {
        this.arr = arr;
        this.number = number;
    }
    public double Ave () {
        double sum = 0;
        for (T element : arr) {
            sum += element.hashCode();
        }

        return sum;
    }
    public boolean sameAve (GenConstructor ob){
        return Ave() == ob.Ave();
    }
}

