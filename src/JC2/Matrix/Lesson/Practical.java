package JC2.Matrix.Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Practical {
    public static void main(String[] args) {
        int n=3,count = 1;
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = count;
                count++;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        n1 -= 1;
        n2 -=1;

        for (int i = 0; i < n; i++) {

        }

    }
}
