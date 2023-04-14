package Colection.OOPLesson.Animals;

public class Cat extends Animal{
    protected int footLength;
    protected String food;

    public Cat(int footLength, String food) {
        this.footLength = footLength;
        this.food = food;
    }
    @Override
    void makeSound(){
        System.out.println("Meow");
    }
}
