package Colection.Hw.HwComparator;

import java.util.Comparator;

public class Animal implements Comparable<Animal> {
    private String name;
    private String colour;


    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        /*int res = this.name.compareTo(o.name);
        if (res == 0)
            res = this.colour.compareTo(o.colour);
        return res;*/
        return this.name.compareTo(o.name);
    }
    static class coloreComparator implements Comparator<Animal>{
        @Override
        public int compare(Animal col1, Animal col2) {
            return col1.colour.compareTo(col2.colour);
        }
    }
}
