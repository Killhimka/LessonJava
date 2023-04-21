package Обобщения;

class Dog extends Animal{
    public Dog (String nameAnimal,String colorAnimal){
        this.nameAnimal = nameAnimal;
        this.colorAnimal = colorAnimal;
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

    @Override
    public String toString() {
        return "Animal{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", colorAnimal='" + colorAnimal + '\'' +
                '}';
    }
    public static void main(String[] args) {
        ClassAnimal classAnimal = new ClassAnimal();
        classAnimal.animal(new Dog("Dog","Red"));
        classAnimal.animal(new Cat());
    }
}
class ClassAnimal extends Animal{
    public  <T> void animal(T ob) {
        System.out.println(ob);
        System.out.println(ob);
    }
}