package JC.Math;
//  алькул€тор синус, косинус, тангенс,катангенс.
import java.util.Scanner;

public class Math8 {
    public static void main(String[] args) {
        int number;
        String sing;
        Scanner scanner = new Scanner(System.in);
        sing = scanner.nextLine();
        number = scanner.nextInt();
        scanner.close();

        switch (sing){
            case "sin":
                System.out.println(Math.sin(Math.toRadians(number)));
                break;
            case "cos":
                    System.out.println(Math.cos(Math.toRadians(number)));
                    break;
            case "tan":
                System.out.println(Math.tan(Math.toRadians(number)));
                    break;
            case "ctan":
                System.out.println(1/(Math.tan(Math.toRadians(number))));
                    break;
            default:
                System.out.println("No correct");
            break;
        }
    }
}
