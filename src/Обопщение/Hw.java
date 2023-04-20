package Обобщения;

public class Hw {
    public static <T, V> boolean isIn(T x, V [] array){
        for (V element: array){
            if (x.equals(element)){
                return true;
            }

        }
        return false;
    }
    public static <T, V> boolean isIn1(T x, V [] array){
        for (V element: array){
            if (x.equals(element)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int n = 2;
        String s = "two";
        Integer [] intArray = {1,2,3,4,5};
        if (isIn(n,intArray)){
            System.out.println(n+" уже есть");
        }
        if (isIn1(n,intArray)){
            System.out.println(n+" не входит");
        }
        System.out.println();
        String [] strArray = {"one","two","three","four","five"};
        if (isIn(s,strArray)){
            System.out.println(s+" Входит");
        }
        if (isIn1(s,strArray)){
            System.out.println(s+" Не входит");
        }

    }
}
