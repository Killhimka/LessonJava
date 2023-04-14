package Colection.OOPLesson.Animals;

public class Animal {
    protected String location = "Belarus";
    protected String food;

    void makeSound(){

    }
    public void eat(){
        System.out.println("This animal eat " + this.food);
    }
    public void sleep(){
        System.out.println("This animal sleeps in " + location);
    }
}
