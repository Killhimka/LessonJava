package String.Lesson;
// Определить сколько раз эелемент сделал вхождение в строку.
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char n = scanner.next().charAt(0);
        scanner.close();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==n)
                count++;
        }

        System.out.println(count);
        System.out.println(str);


    }
}
