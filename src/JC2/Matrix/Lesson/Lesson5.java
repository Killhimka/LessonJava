package JC2.Matrix.Lesson;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean ifSymetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]!=matrix[j][i])
                    ifSymetric=false;
            }
        }
        if (ifSymetric)
            System.out.println("Yeas");
        else
            System.out.println("No");
    }
}
