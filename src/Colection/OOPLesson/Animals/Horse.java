package Colection.OOPLesson.Animals;

public class Horse extends Animal {
    protected int maxSpeed;
    protected String food;

    public Horse(int maxSpeed, String food) {
        this.maxSpeed = maxSpeed;
        this.food = food;
    }
    @Override
    void makeSound(){
        System.out.println("Igogo");
    }
}
