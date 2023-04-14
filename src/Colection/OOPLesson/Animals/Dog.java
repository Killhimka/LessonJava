package Colection.OOPLesson.Animals;

public class Dog extends Animal {
    protected int age;
    protected String food;

    public Dog(int age, String food) {
        this.age = age;
        this.food = food;
    }
    @Override
    void makeSound(){
        System.out.println("Woow");
    }
}
