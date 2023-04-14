package JC2.Array.HwArray;

import java.util.Scanner;

public class DZLesson8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 1;
        int[] copy = new int[count];
        boolean numb = true;
        int min = copy.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % i == 0) {min++;}
            //                   count++;
            System.out.println(min);

        }

    }
}
