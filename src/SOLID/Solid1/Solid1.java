package SOLID.Solid1;
// S - Single Responsibility Principle (������� ������������ ���������������) ���:
// ������ ����� �������� �� 1 ����������
// O - Open-Closed Principle (������� ����������-����������) ���:
// ���������� �� ������ ��� ������������ ����� ��������������� ��������������� ������������� � ������������ ��������
// (����������� ������ ����������� ����� ����������)
// L - Liskov Substitution Principle (������� ����������� ������� ������) ���:
// ��������� �������� ����� ������ ��������� ���������� ������� �������, �� ������ ������
// I - Interface Segregation Principle (������� ���������� ����������) ���:
// �� ����� ��������� ���������� ����� �� ���������� �������
// D - Dependency Inversion Principle (������� �������� �����������) ���:
// ������ ������ �������� �� ����������� � ����������� �������, � �� �� ���������� ������� � �������(����)
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
    /*public void save () {                                       // ������ ����������: ������ ����� ������ ������
        System.out.println("���������� ������� ������ � ����");   // ������������ ����� Computer, � ���� ����������
    }                                                         // � �������� �������� ������ ��������� ������ �����,
    public void load (){                                        // ��� ����� ����� ������� ������ �����
        System.out.println("�������� ������� ������ �� �����");
    }*/
}
class SaveComputer{                                // ������ ����������: ������� ������ ����� ��� ���������� �����
    public void saveToFile(String path,Computer cmp){
        System.out.println("C��������� � ���� "+path+", "+cmp);
    }
    public void saveToDB(String path,Computer cmp){
        System.out.println("C��������� � DB "+path+", "+cmp);
    }
}
