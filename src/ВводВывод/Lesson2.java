package ВводВывод;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) throws IOException {
        /*if (!(Files.exists(Path.of("D:/Files/a.txt")))){
            Files.createFile(Path.of("D:/Files/a.txt"));
        }*/
        /*FileInputStream input = new FileInputStream("d:/Files/a.txt");*/

        File file = new File("d:/Проги");
        /*String files = file.getAbsolutePath();
        System.out.println(files);*/

        /*String path = "d:/Files/a.txt";
        File file1 = new File(path);
        System.out.println(file1);*/

        /*File file2 = file.getParentFile();
        System.out.println(file2);*/
        int size;
        System.out.println(file.length());
        System.out.println(file.getParent());
        for (File file3: file.listFiles()){
            System.out.println(file3.getName());
        }
        /*FileInputStream input1 = new FileInputStream(file);*/

    }
}
