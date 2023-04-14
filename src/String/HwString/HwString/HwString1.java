package String.HwString.HwString;
// ќпределить сколько раз буква повтор€етс€ в строке.
import java.util.Scanner;

public class HwString1 {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        n = scanner.nextLine();
        scanner.close();
        int count = 0;

        for (int i = 0; i < line.length(); i++)
            if (line.charAt(i) == n.charAt(0))
                count++;

        System.out.println(count);
    }
}
