package Обобщения;

public class Hw {
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
            Integer [] intArray = {1,2,3,4,5};
            if (isIn(5,intArray)){
                System.out.println("2 уже есть");
            }
            if (isIn1(7,intArray)){
                System.out.println("7 не входит");
            }
            System.out.println();
            String [] strArray = {"one","two","three","four","five"};
            if (isIn("two",strArray)){
                System.out.println("Входит");
            }
            if (isIn1("seven",strArray)){
                System.out.println("Не входит");
            }
        }
}
