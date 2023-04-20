package Обобщения;

public class Hw1{
    public static void main(String[] args) {
        Hw3 hw3 = new Hw3();
        Hw3 hw4 = new Hw4();
        Hw2 hw2 = new Hw2<>(hw4,hw3);
    }
}
class Hw2<T,V>{
    private T ob1;
    private V ob2;
    public Hw2 (T ob1,V ob2){
        if (ob1.equals(ob2)){
            System.out.println("Yes");
        } else System.out.println("no");
    }


}
class Hw3{
    int b;
}
class Hw4 extends Hw3{
    int s;
}
