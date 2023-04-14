package Файлы;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class РаботаСФайлами {
    public static void main(String[] args) {
        String s = "";
        try {
            File fO = new File("d:/Files/Папка1/a.txt");
            // тут можно вызвать методы File
            FileInputStream isO = new FileInputStream(fO);
            int i = -1;
            while ((i = isO.read())!=-1){
                s+=(char)i;
                System.out.println(s);
            }
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }
        String[] strBuf = s.split(";");
        for (String i: strBuf)
        System.out.println(i);

    }
}
