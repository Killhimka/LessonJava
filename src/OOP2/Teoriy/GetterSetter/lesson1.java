package OOP2.Teoriy.GetterSetter;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        int a;
        car.setMaxSpeed(scanner.nextInt());
        a = car.getMaxSpeed();
        System.out.println(a);
    }
}
