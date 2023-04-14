package Обопщение;
// среднее значение массива
public class Lesson1 {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Average<Integer> integerAverage = new Average<>(intArray);
        System.out.println(integerAverage.average());

        Double [] doubles = {1.2,2.3,3.5,4.3};
        Average<Double> doubleAverage = new Average<>(doubles);
        System.out.println(doubleAverage.average());

        Float [] floats = {1f,2f,3f,4f,5f};
        Average<Float> floatAverage = new Average<>(floats);
        System.out.println(floatAverage.average());
        if (integerAverage.sameAvg(doubleAverage))
            System.out.println("Eas");
        else System.out.println("No");
        if (integerAverage.sameAvg(floatAverage))
            System.out.println("Eas");
        else
        System.out.println("No");
    }
}
 class Average <T extends Number>{
    private T[] array;

     public Average(T[] array) {
         this.array = array;
     }

     public double average(){
         double sum = 0.0;
         for (T value: array){
             sum += value.doubleValue();
         }
         return sum/ array.length;
     }
     boolean sameAvg(Average<?> ob){
         return average() == ob.average();
     }
 }
