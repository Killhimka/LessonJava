package JC2.Array.Lesson;
// Ќаибольшее число в веденном массиве
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int arr [] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int total=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>total){
                total = arr[i];
            }
        }
        System.out.println(total);
    }
}
