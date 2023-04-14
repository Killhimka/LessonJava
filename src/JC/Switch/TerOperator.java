package JC.Switch;
//Тернарный оперратор
import java.util.Scanner;

public class TerOperator {
    public static void main(String[] args) {
        String answer;
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.close();

        answer = a == 1 ? "It`s Ok" : "Do not worry";
        System.out.println(answer);
    }
}
