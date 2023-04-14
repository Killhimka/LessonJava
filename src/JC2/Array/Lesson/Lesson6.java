package JC2.Array.Lesson;
//  оличество одинаковых чисел в массиве
import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr [j] = arr[i];
                    arr [i] = temp;
                }
            }
        }
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i]!=arr[i+1])
            count ++;
        }
        System.out.println(count);
    }
}
