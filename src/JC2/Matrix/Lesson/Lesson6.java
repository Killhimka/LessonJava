package JC2.Matrix.Lesson;
// Задана матрица, определить есть ли свободные места рядом 0 свободно, 1 занято
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int number = scanner.nextInt();
        int count = number;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0){
                    count--;
                    if (count==0){
                        System.out.println("Can");
                        System.exit(1);
                    }
                }   else {
                    count = number;
                }
            }
            count = number;
        }
        System.out.println("Can`T");

    }
}
