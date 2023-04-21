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
        ClassAnimal classAnimal = new ClassAnimal<>();
        classAnimal.animal(new Cet());
    }
}
class ClassAnimal <T> extends Animal{
    public <T> void animal(T ob) {
        Cat cat = new Cat();
        System.out.println(cat.nameAnimal+" "+cat.colorAnimal);
    }
}