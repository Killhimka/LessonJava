package JC2.Matrix.Lesson;
// Поменять 2 строки местами
import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = count;
                count++;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        int first, second;
        first = scanner.nextInt();
        second = scanner.nextInt();
        scanner.close();

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = matrix[first][i];
        }
        for (int i = 0; i < m; i++) {
            matrix[first][i] = matrix[second][i];
        }
        for (int i = 0; i < m; i++) {
            matrix[second][i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
