package Colection.Hw;

import java.util.Arrays;

public class ColectionEndMassiv {
    public static void main(String[] args) {
        int[] numbers = {167,-2,16,99,26,92,43,-234,35,80};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));  // ���������� �������

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {1,2,3};
        System.out.println(Arrays.equals(numbers1,numbers2)); // ��������� ��������

        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length);      // �������� ��� ���������� �������
        System.out.println(Arrays.toString(numbersCopy));

        int[] numbersCopy1 = Arrays.copyOf(numbers,4); // �������� 4 ������ ��������
        System.out.println(Arrays.toString(numbersCopy1));

        int[] numbersCopy2 = Arrays.copyOfRange(numbers,2,6);
        System.out.println(Arrays.toString(numbersCopy2));      // �������� ��������� �������� �� � ��

        String numbersCopy3 = Arrays.toString(numbers);  // ������ �� ������� ������
        System.out.println(numbersCopy3);


    }
}
