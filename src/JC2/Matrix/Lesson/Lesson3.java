package JC2.Matrix.Lesson;
// Матрица отнять 1 строку от другой.
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int [][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int first, second;
        first = scanner.nextInt();
        second = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < m; i++) {
            matrix[first][i] -= matrix[second][i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
