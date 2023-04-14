package JC2.Array.HwArray;
// Найти минимальное четное число в массиве и разделить все числа массива на него
import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        float n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        float arr [] = new float[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        float min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0&&arr[i]<min){
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i]/=min;
            System.out.println(arr[i]);
 //           DecimalFormat format = new DecimalFormat();
 //           System.out.println(format.format(arr[i]));
        }

    }
}
