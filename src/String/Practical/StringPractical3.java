package String.Practical;
// Определить слово полендром или нет (читается ли в обратную сторону)
import java.util.Scanner;

public class StringPractical3 {
    public static void main(String[] args) {
       String str;
       Scanner scanner = new Scanner(System.in);
       str = scanner.nextLine();
       scanner.close();

       char[] strArr = new char[str.length()];
       strArr = str.toCharArray();

       boolean ifPolendrom = true;
        for (int i = 0, j = strArr.length-1; i < strArr.length/2 &&
                 j> strArr.length/2; i++,j--) {
            if (strArr[i] != strArr[j])
                ifPolendrom = false;
        }
        if (ifPolendrom) {
            System.out.println("Polendrom");
        }else
            System.out.println("No polendrom");


    }
}
