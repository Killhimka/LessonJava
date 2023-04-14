package StreamAPI.Hw1;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(getName());
    }
}

    /*static class ageComparator implements Comparator <Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.age.compareTo(o2.age);
        }
    }
}*/
