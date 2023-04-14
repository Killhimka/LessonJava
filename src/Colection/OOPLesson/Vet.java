package Colection.OOPLesson;

import Colection.OOPLesson.Animals.Animal;

public class Vet {
    protected String name;

    public Vet(String name) {
        this.name = name;
    }
    public void treer(Animal animal){
        System.out.println(animal.getClass()+" is healthy");
        System.out.println("By "+this.name);
    }
}
