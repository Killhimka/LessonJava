package JC2.Array.HwArray;
// ¬ывод количества массива и содержимое
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]);
        }
    }

}
