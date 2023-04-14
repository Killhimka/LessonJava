package Colection.Hw.Map.Lesson2;
// Выводит пользователей в заданном диапазоне ключей
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Person person = new Person(12, "Dima");
        Person person1 = new Person(31, "Vasily");
        Person person2 = new Person(23, "Igor");

        map.put(person.getName(),person.getAge());
        map.put(person1.getName(),person1.getAge());
        map.put(person2.getName(),person2.getAge());

        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b= scanner.nextInt();
        scanner.close();

        if (a>b){
            int temp = a;
            a=b;
            b=temp;
        }
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            if (entry.getValue()>=a&&entry.getValue()<=b)
                System.out.println(entry.getKey());
        }
    }
}
