package OOP.Lesson.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {

        for (CoffeeSize c : CoffeeSize.values())
            System.out.println(c + " " + c.ordinal());
        CoffeeSize coffeeSize = CoffeeSize.valueOf( "Big");
        System.out.println(coffeeSize);
    }
}
