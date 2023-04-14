package Файлы;

import java.io.FileInputStream;
import java.io.IOException;

public class Lesson2 {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream("d:/Files/Папка1/a.txt")){
            System.out.println("Общее количество доступных байтов "+(size = f.available()));
            int n = size/110;
            System.out.println("Первые " +n+ " байтов, "+" прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println("\n Все еще доступно: "+f.available());
            System.out.println("Чтение следующих "+n+" байтов по очереди методом read(b[])");
            byte[]b = new byte[n];
            if (f.read(b)!=n){
                System.out.println("Нельзя прочитать" +n+ " байтов");
            }
            System.out.println(new String(b,0,n));
            System.out.println("\n Все еще доступно: "+(size=f.available()));

            System.out.println("Чтение "+n/2+" байтов, размещаемых в конце массива");

            if (f.read(b,n/2,n/2)!=n/2){
                System.out.println("Нельзя прочитать "+n/2+" байтов.");
            }
            System.out.println(new String(b,0,b.length));
            System.out.println("\n Все ещё доступно: "+f.available());
        } catch (IOException e) {
            System.out.println("Ошибка"+e);
        }
    }
}
