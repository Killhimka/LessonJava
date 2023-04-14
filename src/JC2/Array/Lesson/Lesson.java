package JC2.Array.Lesson;
// Сортировка массива от меньшего к большему
import java.util.Arrays;
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int new_arr[];
        int [] new_arr1 = new int[]{ 1,2,3,4,5,6};
        int [] new_arr2 = { 1,2,3,4,5,6};

        new_arr = new int[5];
        new_arr[0] = scanner.nextInt();
        new_arr[1] = scanner.nextInt();
        new_arr[2] = scanner.nextInt();
        new_arr[3] = scanner.nextInt();
        new_arr[4] = scanner.nextInt();
        scanner.close();
        Arrays.sort(new_arr);

  //      int total = new_arr[0];
  //      for (int i = 0; i < new_arr.length; i++) {
  //          if (new_arr[i] > total) total = new_arr[i]; // вычисление наибольшего числа в массиве

//          total += new_arr[i]; сумма всех чисел в массиве

            System.out.println(Arrays.toString(new_arr));
            }


  //      System.out.println(new_arr2[new_arr2.length-1]);


}
