package JC2.Array.Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s size");
        n = scanner.nextInt();                          // введите количество элементов в массиве

        System.out.println("Enter array`s elements");
        int [] arr = new int[n];                            // введите элементы массива
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();                         // считываем элементы массива
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;                  // сортируем все эелементы массива от меньшего к большему
 //                   System.out.println(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));   // проверяем: вывод элементов пузырьком

        int count = 1;                                 // открываем щетчик
        for (int i = 0; i < n-1; i++)                   // считываем наши элементы
          if (arr[i]!= arr[i+1]) {                // условия счетчика: если элемент не равен следующему элементу +1
              count++;                                // добавляем количество в щетчик

              System.out.println(count);              // проверяем: количество уникальных элементов
          }
        int [] arrCopy = new int [count];           // создаем новый счетчик
        for (int i = 0, j = 0; i < n; i++) {      // копируем элементы с 1 счетчика в другой
            if (arr[i]!=arr[j+1]) {               // условия копии: не равен следующему элементу
                arrCopy[i] = arr[i];             // если условия выполнены переносим элемент с 1го счетчика во второй
                j++;                             // добавляем нашь элемент в новый счетчик
            }
        }
            System.out.println(Arrays.toString(arrCopy));





    }
}
