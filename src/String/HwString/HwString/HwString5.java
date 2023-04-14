package String.HwString.HwString;
// Найти самое длинное слово в строке.
import java.util.Scanner;

public class HwString5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        scanner.close();

        String str1 = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length()>=str1.length())
                str1=str[i];
        }

        System.out.println(str1);



    }
}
