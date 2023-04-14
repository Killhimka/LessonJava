package JC.Switch;

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        int place;
        Scanner scanner = new Scanner(System.in);
        place = scanner.nextInt();
        scanner.close();

        switch (place){
            case 1:
                System.out.println("Gold medal");
                break;
            case 2:
                System.out.println("Silver medal");
                break;
            case 3:
                System.out.println("Bronze medal");
                break;
            default:
                System.out.println("Wooden medal");
                break;
        }
    }
}
