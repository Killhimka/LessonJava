package JC2.Matrix.Lesson;


public class Lesso {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5},{6,7,8}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
