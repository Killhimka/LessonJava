package String.Practical;
// Найти самую большую цифру в введенной строке.
import java.util.Scanner;

public class StringPractical6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        scanner.close();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            if (Integer.valueOf(str[i])>max){
                max=Integer.valueOf(str[i]);
            }
        }
        System.out.println(max);
    }
}
