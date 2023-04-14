package OOP.Lesson.Lesson;

public class Pet {
    int age;
    String name;
    void makeSound(){               // סמחהאול לועמה
        System.out.println("MeoW");             // גûחûגאול לועמה
    }


    public Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }
}
