package Colection.Hw.Map.Lesson1;
// Мини база данных
import java.util.HashMap;
import java.util.Map;

public class Lesson1 {
    public static void main(String[] args) {
        Map<User,Manager> map = new HashMap<>();
        User user1 = new User("Olga","Sairmova");
        User user2 = new User("Vasily","Ivanov");
        Manager manager1 = new Manager("Ivan",3);
        Manager manager2 = new Manager("Nikoly",1);
        map.put(user1,manager1);
        map.put(user2,manager2);
        System.out.println(map);
    }
}
