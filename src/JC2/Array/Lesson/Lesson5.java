package JC2.Array.Lesson;
// Отнять минимальный положительный элемент от каждого числа в массиве
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr [i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        boolean ifHavePositive = false;
        for (int i = 0; i < n; i++) {
            if (arr[i]>0&&arr[i]<min){
                ifHavePositive = true;
                min = arr[i];
            }
        }
        if (!ifHavePositive){
            System.out.println("No positive elements");
            System.exit(1);
        }
        for (int i = 0; i < n; i++) {
            arr[i] -= min;
            System.out.println(arr[i]);
        }

    }
}
