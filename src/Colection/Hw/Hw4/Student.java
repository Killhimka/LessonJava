package Colection.Hw.Hw4;

import java.util.LinkedList;

public class Student {
    private String name;
    private int group;
    private int curs;
    private int Match;
    private int Russian;
    private int Geografi;
    private int Istoria;

    public Student(String name, int group, int curs, int match, int russian, int geografi, int istoria) {
        this.name = name;
        this.group = group;
        this.curs = curs;
        this.Match = match;
        this.Russian = russian;
        this.Geografi = geografi;
        this.Istoria = istoria;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", Переведен на " + getCours() +" курс"+
                '}';
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCurs() {
        return curs;
    }

    public int getMatch() {
        return Match;
    }

    public int getRussian() {
        return Russian;
    }

    public int getGeografi() {
        return Geografi;
    }

    public int getIstoria() {
        return Istoria;
    }

    public int getSum(){
        return (Istoria+Match+Russian+Geografi)/4;
    }
    public int getCours(){
        return curs+1;
    }
}
