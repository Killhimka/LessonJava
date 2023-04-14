package Colection.Hw;
// Добавить 10 животных в линкедлист и удалить те, у которых первая буква гласная
import java.util.*;

public class Animal {
private String name;

    public Animal(String name) {
        this.name = name;
    }

    public static  void main(String[] args) {
        Animal duck = new Animal("Duck");
        Animal swallow = new Animal("swallow");
        Animal partridge = new Animal("partridge");
        Animal albatross = new Animal("albatross");
        Animal oriole = new Animal("oriole");
        Animal udot = new Animal("Udot");
        Animal eagle = new Animal("Eagle");
        Animal ibis = new Animal("ibis");
        Animal lark = new Animal("lark");
        Animal swan = new Animal("swan");

        LinkedList<Animal> animals = new LinkedList(Arrays.asList(
                duck,swallow,partridge,albatross,oriole,udot,eagle,ibis,lark,swan));


        animals.removeIf(animal->animal.name.substring(0, 1).toLowerCase().matches("(?i)[aeuio]"));
        animals.removeIf(animal -> animal.name.matches("(?i)[aeuoi][a-z]+"));

        System.out.println(animals);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
