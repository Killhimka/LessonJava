package String.HwString.HwString;
// ¬ывести слова с одинаковой 1 и последней буквой.
import java.util.Scanner;

public class HwString4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lina = scanner.nextLine().split(" ");
        scanner.close();

        for (String lina1: lina){
            if (lina1.charAt(0)==lina1.charAt(lina1.length()-1))
                System.out.println(lina1);
        }
    }
}
