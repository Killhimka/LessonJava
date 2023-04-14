package Colection.OOPLesson;

import Colection.OOPLesson.Animals.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson {
    public static void main(String[] args) {
        Cat cat = new Cat(12,"Fish");
        Dog dog = new Dog(10,"Meat");
        Horse horse = new Horse(25,"Grass");
        Vet vet = new Vet("John");
        List<Animal> list = new ArrayList(Arrays.asList(cat,dog,horse));

        for (Animal animal: list){
            vet.treer(animal);
        }

    }
}
