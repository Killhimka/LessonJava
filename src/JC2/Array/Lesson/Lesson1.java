package JC2.Array.Lesson;
// Нечетные цыфры массива
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
      int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i]%2!=0){
                System.out.println(array[i]);
            }
        }

    }
}
