package JC.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        switch (number){
            case 1:
                System.out.println("Единица");
                break;
            case 2:
                System.out.println("Двойка");
                break;
            case 3:
                System.out.println("Тройка");
                break;
            default:
                System.out.println("Не подходит условию");
                break;
        }
    }
}
