package JC2.Matrix.Lesson;
// Вывод элементов по диагонали
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix [i][j] = scanner.nextInt();
            scanner.close();
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}
