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
                System.out.println("�������");
                break;
            case 2:
                System.out.println("������");
                break;
            case 3:
                System.out.println("������");
                break;
            default:
                System.out.println("�� �������� �������");
                break;
        }
    }
}
