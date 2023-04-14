package JC2.Array.HwArray;
// Каждое 2 число массива
import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr [i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i+=2) {
            System.out.println(arr[i]);
        }
    }
}
