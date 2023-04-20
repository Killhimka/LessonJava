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

    public static void main(String[] args) {

        Integer [] intArray = {1,2,3,4,5};
        if (isIn(n,intArray)){
            System.out.println(" уже есть");
        }
        if (isIn1(n,intArray)){
            System.out.println(" не входит");
        }
        System.out.println();
        String [] strArray = {"one","two","three","four","five"};
        if (isIn(s,strArray)){
            System.out.println(" Входит");
        }
        if (isIn1(s,strArray)){
            System.out.println(" Не входит");
        }

    }
}
