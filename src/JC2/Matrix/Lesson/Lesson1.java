package JC2.Matrix.Lesson;
// Строки в матрице в которых сумма содержимого больше 0
import java.util.Scanner;

public class Lesson1 {
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
        int number = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                number += matrix[i][j];
            }
            if (number / m > 0) {
                System.out.println(i);
            }
            number = 0;
        }
    }
}
