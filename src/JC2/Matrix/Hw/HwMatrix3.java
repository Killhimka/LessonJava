package JC2.Matrix.Hw;
// Заменить элементы матрицы по деагонали и строку на выбор
import java.util.Arrays;
import java.util.Scanner;

public class HwMatrix3 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int max = 9;
        int min = 0;

        int[][] matrix = new int[n][n];
        int[] arr = new int[]{7,4,1,6};
        int[] arr1 = new int[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
                matrix[i][i] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = matrix[m][i];
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
