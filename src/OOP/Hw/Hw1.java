package OOP.Hw;
// Вычислить правильно ли введен номер телефона.

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        int n = scanner.nextInt();
        if (customer.number == n)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(customer.toString());




    }
}
class Customer {
    String family = "Alpin";
    String name = "Alex";
    int date = 15121985;
    int number = +37533;

    @Override
    public String toString() {
        return "Customer{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", number=" + number +
                '}';
    }
}