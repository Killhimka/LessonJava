package Файлы;

import java.io.*;
import java.util.Scanner;

// Чтение из файла
public class ЧтениеИзФайла {
    public static void main(String[] args) throws IOException {
        /*FileReader fileReader = new FileReader("readme.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        while ((str = bufferedReader.readLine())!=null){
            System.out.println(str);            // Вывод без первой строки
        }*/
        /*Scanner scanner = new Scanner(new File("d:/Files/Папка1/a.txt"));
        String str1 = scanner.nextLine();
        System.out.println(str1);           // Вывод первой строки*/
        /*fileReader.close();
        System.out.println(str);*/

        FileInputStream fI = new FileInputStream("d:/Files/Папка1/a1.txt");
        int i = 0;
        while ((i = fI.read())!=-1)
        System.out.print((char)i );             // Выводит весь текст из файла

        /*FileInputStream fI = new FileInputStream("d:/Files/Папка1/a1.txt");
        StringBuffer s = new StringBuffer();        // Запись в строковую переменную
        int i = 0;
        while ((i = fI.read())!=-1)
            s.append((char) i);
        System.out.println(s);                  // Вывод весь текс из файла*/
    }
}
