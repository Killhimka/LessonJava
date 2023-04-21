package Обобщения;

import java.util.Arrays;

class Dog extends Animal{
    public Dog(String nameAnimal, String colorAnimal) {
        super(nameAnimal = "Dog", colorAnimal = "Blue");
    }
}
class Cat extends Animal {
    public Cat(String nameAnimal, String colorAnimal) {
        super(nameAnimal = "Cat", colorAnimal = "Red");
    }
}
public class Animal {
     String nameAnimal;
     String colorAnimal;

    public Animal(String nameAnimal, String colorAnimal) {
        this.nameAnimal = nameAnimal;
        this.colorAnimal = colorAnimal;
    }

    public static void main(String[] args) {
        ClassAnimal classAnimal = new ClassAnimal<>("Name","Color");
        classAnimal.animal(new Cat("Name","Color"));
    }
}
class ClassAnimal <T> extends Animal{
    public ClassAnimal(String nameAnimal, String colorAnimal) {
        super(nameAnimal, colorAnimal);
    }

    public  <T> void animal(Animal ob) {
        System.out.println(ob.colorAnimal);
        System.out.println(ob.nameAnimal);
    }
}