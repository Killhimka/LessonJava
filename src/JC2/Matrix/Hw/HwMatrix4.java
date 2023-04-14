package JC2.Matrix.Hw;
// Развернуть 1 строку массива на выбор (Реверс)

import java.util.Arrays;
import java.util.Scanner;

public class HwMatrix4 {

    public static void main(String[] args) {
        int n,m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = matrix[m][i];
        }
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int i = 0; i < n; i++) {
            matrix[m][i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
