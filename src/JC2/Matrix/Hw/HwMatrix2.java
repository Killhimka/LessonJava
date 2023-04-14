package JC2.Matrix.Hw;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class HwMatrix2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        int min = 0;
        int max = 20;
        int[][] matrix = new int[n][n];
        int[][] copyMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                matrix[i][j] = (int) (Math.random()*((max-min)+1)+min);
                copyMatrix[i][j] = matrix[i][j];
                copyMatrix[i][j] *=3;
            }
  //          Arrays.sort(copyMatrix[i]);
        }
        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(matrix[i]));
        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(copyMatrix[i]));
    }
}
