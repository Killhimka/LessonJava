package Обобщения;

import org.jetbrains.annotations.NotNull;

public class Hw1{
    public static void main(String[] args) {
        Hw3 hw3 = new Hw3(10);
        Hw3 hw5 = new Hw3(5);
        Hw4 hw4 = new Hw4(8);
        Hw2 hw2 = new Hw2<>(hw5,hw3);
        System.out.println(hw3.getClass());
        System.out.println(hw4.getClass());
        System.out.println(hw5.getClass());
    }
}
class Hw2<T,V>{
    private T ob1;
    private V ob2;
    public Hw2 (T ob1, V ob2){
        System.out.println(ob1.getClass().equals(ob2.getClass()));
    }


}
class Hw3 {
    int b;

    public Hw3(int b) {
        this.b = b;
    }
}
class Hw4 {
    int s;

    public Hw4(int s) {
        this.s = s;
    }
}
