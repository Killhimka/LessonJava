package JC2.Array.Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array`s size");
        n = scanner.nextInt();                          // ������� ���������� ��������� � �������

        System.out.println("Enter array`s elements");
        int [] arr = new int[n];                            // ������� �������� �������
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();                         // ��������� �������� �������
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;                  // ��������� ��� ��������� ������� �� �������� � ��������
 //                   System.out.println(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));   // ���������: ����� ��������� ���������

        int count = 1;                                 // ��������� ������
        for (int i = 0; i < n-1; i++)                   // ��������� ���� ��������
          if (arr[i]!= arr[i+1]) {                // ������� ��������: ���� ������� �� ����� ���������� �������� +1
              count++;                                // ��������� ���������� � ������

              System.out.println(count);              // ���������: ���������� ���������� ���������
          }
        int [] arrCopy = new int [count];           // ������� ����� �������
        for (int i = 0, j = 0; i < n; i++) {      // �������� �������� � 1 �������� � ������
            if (arr[i]!=arr[j+1]) {               // ������� �����: �� ����� ���������� ��������
                arrCopy[i] = arr[i];             // ���� ������� ��������� ��������� ������� � 1�� �������� �� ������
                j++;                             // ��������� ���� ������� � ����� �������
            }
        }
            System.out.println(Arrays.toString(arrCopy));





    }
}
