package SOLID.Solid1;
// S - Single Responsibility Principle (Принцип единственной ответственности) это:
// Каждый класс отвечает за 1 функционал
// O - Open-Closed Principle (принцип открытости-закрытости) это:
// Желательно не менять уже существующий класс предпочтительно воспользоваться Полиморфизмом и Обстрактными классами
// (обстрактные классы реализуются через интерфейсы)
// L - Liskov Substitution Principle (принцип подстановки Барбары Лисков) это:
// Дочерними классами можно только расширять функционал базовых классов, но НЕЛЬЗЯ менять
// I - Interface Segregation Principle (принцип разделения интерфейса) это:
// Не нужно создавать абсрактный класс со множеством методов
// D - Dependency Inversion Principle (принцип инверсии зависимости) это:
// Классы должны зависеть от интерфейсов и обстрактных классов, а не от конкретных классов и функций(форм)
public class Solid1 {
    public static void main(String[] args) {
        Computer comp = new Computer("IBM XT",5000);
        SaveComputer saver = new SaveComputer();
        saver.saveToFile("out.data",comp);
        saver.saveToDB("out.data",comp);
    }
}
class Computer{
    String name;
    int memory_size;

    public Computer(String name, int memory_size) {
        this.name = name;
        this.memory_size = memory_size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", memory_size=" + memory_size +
                '}';
    }
    /*public void save () {                                       // Плохое исполнение: Данный класс должен только
        System.out.println("Сохранение объекта класса в файл");   // представлять класс Computer, а роль сохранения
    }                                                         // и загрузки объектов пускай выполняет другой класс,
    public void load (){                                        // для этого нужно создать другой класс
        System.out.println("Загрузка объекта класса из файла");
    }*/
}
class SaveComputer{                                // Верное исполнение: Создаем другой класс для выполнения задач
    public void saveToFile(String path,Computer cmp){
        System.out.println("Cохранение в файл "+path+", "+cmp);
    }
    public void saveToDB(String path,Computer cmp){
        System.out.println("Cохранение в DB "+path+", "+cmp);
    }
}
