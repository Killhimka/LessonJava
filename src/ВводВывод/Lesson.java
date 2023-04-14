package ВводВывод;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Мы сосчитали строку");
        System.out.println(s);
    }
}
