package OOP.Hw.Hw4;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private int nHome = 43;
    private String street =  "Ћидска€";

    void setnHome(){
        int nHome1;
            System.out.print("¬ведите название улицы: ");
            String street1 = scanner.nextLine();
            System.out.print("¬ведите номер дома: ");
            nHome1 = scanner.nextInt();
            if (nHome1 == nHome) {
                if (street.equalsIgnoreCase(street1))
                    System.out.println("¬веденный адрес верен: ");
                else System.out.println("¬веденный адрес не верен: ");
            }else
                System.out.println("јдрес введен не верно: ");

    }
}
