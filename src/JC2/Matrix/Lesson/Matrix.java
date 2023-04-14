package JC2.Matrix.Lesson;
// Заполнение матрицы с помощью щетчика
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < j; j++) {
            }
            System.out.println(Arrays.toString(matrix[i]));
        }


    }
}
