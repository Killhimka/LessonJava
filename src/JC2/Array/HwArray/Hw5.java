package JC2.Array.HwArray;
// Сколько повторений в массиве
import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr [i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n -1; i++)
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        System.out.println(count);
    }
}
