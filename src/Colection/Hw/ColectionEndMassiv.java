package Colection.Hw;

import java.util.Arrays;

public class ColectionEndMassiv {
    public static void main(String[] args) {
        int[] numbers = {167,-2,16,99,26,92,43,-234,35,80};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));  // сортировка массива

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {1,2,3};
        System.out.println(Arrays.equals(numbers1,numbers2)); // сравнение массивов

        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length);      // копирует все содержимое массива
        System.out.println(Arrays.toString(numbersCopy));

        int[] numbersCopy1 = Arrays.copyOf(numbers,4); // копирует 4 первых элемента
        System.out.println(Arrays.toString(numbersCopy1));

        int[] numbersCopy2 = Arrays.copyOfRange(numbers,2,6);
        System.out.println(Arrays.toString(numbersCopy2));      // копирует указанные элементы от и до

        String numbersCopy3 = Arrays.toString(numbers);  // Делает из массива строку
        System.out.println(numbersCopy3);


    }
}
