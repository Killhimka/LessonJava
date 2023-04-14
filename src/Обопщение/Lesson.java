package Обопщение;

public class Lesson {
    public static void main(String[] args) {
        TwoGen <Integer,String> twoGen = new TwoGen<>(35,"Generics");
        TwoGen<String,Integer> twoGen1 = new TwoGen<>("Gen",33);
        twoGen.showTypes();
        System.out.println(twoGen.getObT());
        System.out.println(twoGen.getObV());
        System.out.println(twoGen1.getObT());
        System.out.println(twoGen1.getObV());
    }
}
 class TwoGen<T, V> {
    private T obT;
    private V obV;

     public TwoGen(T obT, V obV) {
         this.obT = obT;
         this.obV = obV;
     }
     public void showTypes(){
         System.out.println(obT.getClass().getName());
         System.out.println(obV.getClass().getName());
     }

     public T getObT() {
         return obT;
     }

     public V getObV() {
         return obV;
     }
 }