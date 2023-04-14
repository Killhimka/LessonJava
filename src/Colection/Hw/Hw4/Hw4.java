package Colection.Hw.Hw4;
// Считает средний бал студентов и переводит их на след курс, если ср бал проходной
import java.util.Arrays;
import java.util.LinkedList;


public class Hw4 {
    public static void main(String[] args) {
        Student st1 = new Student("Jeck",2,1,3, 5, 6, 7);
        Student st2 = new Student("Ilona",1,4,8,9,8,7);
        Student st3 = new Student("Oleg",2,1,2,2,2,2);
        Student st4 = new Student("Ira",1,2,5,8,7,8);
        Student st5 = new Student("Ken",1,3,2,2,5,2);
        LinkedList <Student> ll = new LinkedList(Arrays.asList(st1,st2,st3,st4,st5));
        ll.removeIf(student -> student.getSum()<3);
        System.out.println(ll);
    }

}
