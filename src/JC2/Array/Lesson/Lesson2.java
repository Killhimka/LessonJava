package JC2.Array.Lesson;
// Цифра равная предыдущей в массиве
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (array[i]==array[i-1]){
            }
            System.out.println(array[i]);
        }
    }
}
