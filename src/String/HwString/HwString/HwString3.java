package String.HwString.HwString;
// Вывести количество слов с одинаковой 1 и последней буквой.
import java.util.Scanner;

public class HwString3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] lina = scanner.nextLine().split(" ");
        scanner.close();
        int count = 0;
        for (int i = 0; i < lina.length; i++) {
            if (lina[i].charAt(0) == lina[i].charAt(lina[i].length()-1)) {
                count++;
            }
        }
        System.out.println(count);







    }
}
