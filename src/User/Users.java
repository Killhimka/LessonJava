package User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Users {
    static Map <Integer,User> userMap = new HashMap<>();
    public static void main(String[] args) {
        User user = new User("Frenk ", 35,"Male");
        User user1 = new User("Julia ", 82,"Femali");
        User user2 = new User("Frenk ", 23,"Male");
        User user3 = new User("Frenk ", 42,"Male");
        User user4 = new User("John ", 23,"Male");
        User user5 = new User("Frenk ", 43,"Male");
        User user6 = new User("Ola ", 28,"Femali");
        User user7 = new User("Frenk ", 32,"Male");
        User user8 = new User("Ulia ", 17,"Femali");
        User user9 = new User("Frenk ", 32,"Male");
        User user10 = new User("Frenk ", 32,"Male");
        User user11 = new User("Inna ", 48,"Femali");
        User user12 = new User("Frenk ", 32,"Male");
        System.out.println(Users.userMap);
        user5.getUserMap();
        user5.ageSum();
        user.averageSex();
        user.userMale();
        user.userFemali();
    }
}
class User{
    private int id;
    private String name;
    private int age;
    private String sex;
    int count;

    public User(String name, int age, String sex) {
        this.id = Users.userMap.size()+1;
        this.name = name;
        this.age = age;
        this.sex = sex;
        Users.userMap.put(id,this);
        count++;
    }

    public void getUserMap() {
        System.out.println(Users.userMap.size()+" User");
        System.out.println(
                Users.userMap.entrySet().stream()
                        .filter(o -> o.getValue().sex.equals("Male"))
                        .count() +" Male"
        );
        System.out.println(
                Users.userMap.entrySet().stream()
                        .filter(o -> o.getValue().sex.equals("Femali"))
                        .count() +" Femali"
        );
    }
    public void ageSum(){
        System.out.println(
                Users.userMap.entrySet().stream()
                        .mapToInt(o->o.getValue().age).sum()+" Сумма возраста всех пользователей"
        );
        System.out.println(
                Users.userMap.entrySet().stream()
                        .filter(o->o.getValue().sex.equals("Male"))
                        .mapToInt(o->o.getValue().age).sum()+" Сумма возраста всех мужчин"
        );
        System.out.println(
                Users.userMap.entrySet().stream()
                        .filter(o->o.getValue().sex.equals("Femali"))
                        .mapToInt(o->o.getValue().age).sum()+" Сумма возраста всех женщин"
        );
    }
    public void averageSex(){
        System.out.println(
                Users.userMap.entrySet().stream()
                        .mapToInt(o->o.getValue().age).average()+" Средний возраст всех пользователей"
        );
        System.out.println(
                Users.userMap.entrySet().stream()
                        .filter(o->o.getValue().sex.equals("Male"))
                        .mapToInt(o->o.getValue().age).average()+" Средний возраст всех мужчин"
        );
        System.out.println(
                Users.userMap.entrySet().stream()
                        .filter(o->o.getValue().sex.equals("Femali"))
                        .mapToInt(o->o.getValue().age).average()+" Средний возраст всех женщин"
        );
    }
    public void userMale(){
        Users.userMap.entrySet().stream()
                .filter(o->o.getValue().sex.equals("Male"))
                .forEach(System.out::println);
    }
    public void userFemali(){
        Users.userMap.entrySet().stream()
                .filter(o->o.getValue().sex.equals("Femali"))
                .forEach(System.out::println);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && name.equals(user.name) && sex.equals(user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

