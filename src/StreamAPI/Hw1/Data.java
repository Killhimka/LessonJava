package StreamAPI.Hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    static List <Person> list = new ArrayList<>();
    static {
        Person person1 = new Person("Jack", 30);
        Person person2 = new Person("Alex", 27);
        Person person3 = new Person("Oleg", 20);
        Person person4 = new Person("Julia", 41);
        Person person5 = new Person("Jams", 46);
        Person person6 = new Person("Maks", 35);
        Person person7 = new Person("Vlad", 25);
        Person person8 = new Person("Inna", 32);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);
        list.add(person7);
        list.add(person8);
    }

    public static List<Person> getList() {
        return list;
    }
}
