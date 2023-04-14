package Файлы;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ЗаписьВФайл {
    public static void main(String[] args) throws IOException {
        /*String str = "Я люблю джава";
        File file = new File("d:/Files/Папка1/a1.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.write("sdfghsdfh");
        fileWriter.close();                         // 1 способ записи в файл*/

        String text = "Привет мир";
        /*PrintStream prStr = new PrintStream("d:/Files/Папка1/a1.txt");
        prStr.println(text);
        prStr.println("sdfhgsdfh");                 // 2 способ записи в файл*/

        /*FileOutputStream fO = new FileOutputStream("d:/Files/Папка1/a1.txt", true);
        byte[] buf = text.getBytes();
        fO.write(buf);*/

    }
}
