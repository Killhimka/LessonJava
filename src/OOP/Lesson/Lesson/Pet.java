package OOP.Lesson.Lesson;

public class Pet {
    int age;
    String name;
    void makeSound(){               // ������� �����
        System.out.println("MeoW");             // �������� �����
    }


    public Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }
}
