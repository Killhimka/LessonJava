package OOP.Hw.Hw4;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private int nHome = 43;
    private String street =  "�������";

    void setnHome(){
        int nHome1;
            System.out.print("������� �������� �����: ");
            String street1 = scanner.nextLine();
            System.out.print("������� ����� ����: ");
            nHome1 = scanner.nextInt();
            if (nHome1 == nHome) {
                if (street.equalsIgnoreCase(street1))
                    System.out.println("��������� ����� �����: ");
                else System.out.println("��������� ����� �� �����: ");
            }else
                System.out.println("����� ������ �� �����: ");

    }
}
