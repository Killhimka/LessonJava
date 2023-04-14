package Colection;
// удал€ет элементы если последн€€ буква о
import Colection.Hw.Animal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        String str = "alo";
        String str1 = "Java";
        String str2 = "Hello";

        List<String> list = new LinkedList(Arrays.asList(str,str1,str2));
        list.removeIf(s -> s.endsWith("o"));

        System.out.println(list);
    }
}
