package OOP2.HwOOP2.Hw1;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    String street = scanner.nextLine();
    int home = scanner.nextInt();
    int flat = scanner.nextInt();
    Order order = new Order();

    public void comparison(){
        if (name.equalsIgnoreCase(order.name))
            if (street.equalsIgnoreCase(order.street))
                if (home==order.home&&flat==order.flat)
                    System.out.println("Yes");
        else System.out.println("No1");
        else System.out.println("No2");
        else System.out.println("No3");
    }
}
