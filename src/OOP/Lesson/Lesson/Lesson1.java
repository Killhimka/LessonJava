package OOP.Lesson.Lesson;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

// название класса/название объекта/ оператор new/ название класса / передает(оргумент) в наш класс
        Scanner scanner = new Scanner(System.in);       //объект класса сканер
//класс / создаем объект / new
        Pet pet = new Pet(2,"rex");
        pet.makeSound();                // вызываем метод ѕэт в классе Lesson1
    }
}
