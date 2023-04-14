package OOP.Lesson.Lesson2;

public class Persone {
    private String name;
    private int age;

    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void talk (){
        System.out.println(this.name + " " + "talking");
    }
     void move(){
        System.out.println("Person at "+ this.age + " is moving");
    }
}
