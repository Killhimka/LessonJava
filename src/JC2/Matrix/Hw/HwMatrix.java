package JC2.Matrix.Hw;

import java.util.Scanner;

public class HwMatrix {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int [][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int min = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (min<matrix[i][j])
                    min = matrix[i][j];
            }
            System.out.println(min);
            min = Integer.MIN_VALUE;
        }
    }
}
