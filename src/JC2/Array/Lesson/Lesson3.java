package JC2.Array.Lesson;
// Вывод индекса массива
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ind = scanner.nextInt();
        ind -= 1;
        System.out.println(arr[ind]);
    }
}
