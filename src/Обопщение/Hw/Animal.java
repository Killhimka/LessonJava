package Обобщения;

class Dog extends Animal{
    public Dog (){
        this.nameAnimal = "Dog";
        this.colorAnimal = "Blue";
    }
}
class Cat extends Animal {
    public Cat (){
        this.nameAnimal = "Cat";
        this.colorAnimal = "Red";
    }
}
public class Animal {
    String nameAnimal;
    String colorAnimal;
    public static void main(String[] args) {
        ClassAnimal classAnimal = new ClassAnimal();
        classAnimal.animal(new Dog());
    }
}
class ClassAnimal extends Animal{
    public  <T> void animal(T ob) {
        System.out.println(((Animal)ob).colorAnimal);
        System.out.println(((Animal)ob).nameAnimal);
    }
}