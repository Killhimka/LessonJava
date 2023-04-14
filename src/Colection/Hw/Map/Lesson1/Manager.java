package Colection.Hw.Map.Lesson1;

public class Manager {
    private String name;
    private int department;

    public Manager(String name, int department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
