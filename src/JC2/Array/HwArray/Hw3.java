package JC2.Array.HwArray;
// Минимальный элемент массива
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min){
                min = arr[i];
            };
        }
        System.out.println(min);
    }
}
