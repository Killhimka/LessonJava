package Обобщения;
class Dog extends Animal{
    String nameAnimal = "Dog";
    String colorAnimal = "Blue";
    public Dog (){
        System.out.println("Представляем вам "+nameAnimal+" "+colorAnimal+" цвета");
    }
}
class Cet extends Animal {
    String nameAnimal = "Cet";
    String colorAnimal = "Red";
    public void Cet(){
    System.out.println("Представляем вам "+nameAnimal+" "+colorAnimal+" цвета");
    }

}
public class Animal {
    private String nameAnimal;
    private String colorAnimal;

    public static void main(String[] args) {
        ClassAnimal classAnimal = new ClassAnimal<>(new Dog());
    }
}
class ClassAnimal <T> extends Animal{
    T ob;
    public ClassAnimal(T ob) {
        this.ob = ob;
    }
}