package JC.Lesson;
// Boolean
import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        boolean ifExist = true;

        if (a+b<c)
            ifExist = false;
        else if (a+c<b)
            ifExist = false;
        else if (b+c<a)
            ifExist = false;

        if (ifExist)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
