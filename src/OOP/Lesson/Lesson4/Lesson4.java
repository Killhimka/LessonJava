package OOP.Lesson.Lesson4;

import java.util.Date;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Car car = new Car("Audi");
        System.out.println("Enter "+car.getModel()+" maxSpeed");
        Scanner scanner = new Scanner(System.in);
        car.setMaxSpeed(scanner.nextInt());
        System.out.println("Enter "+car.getModel()+"volume");
        car.setVolume(scanner.nextInt());
        System.out.println(car);
    }
}
