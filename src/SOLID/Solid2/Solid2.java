package SOLID.Solid2;

import SOLID.Solid1.Solid1;

public class Solid2 {
    public static void main(String[] args) {
    Computer comp = new Computer("IBM XT",5000);
    SaveInterface saver = new SaveComputerToFile();
    SaveInterface saverDB = new SaveComputerToDB();
    saverDB.save("out.data",comp);
    saver.save("out.data",comp);
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
}
class SaveComputerToFile implements SaveInterface {
    public void save(String path, Computer cmp){
        System.out.println("Cохранение в файл "+path+", "+cmp);
    }
}
class SaveComputerToDB implements SaveInterface{
    public void save(String path, Computer cmp){
        System.out.println("Cохранение в DB "+path+", "+cmp);
    }
}
interface SaveInterface{                // создание интерфейса
    void save(String path, Computer cmp);
}
