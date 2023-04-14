package Файлы;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Создание файла
public class СозданиеФайла {
    public static void main(String[] args) throws IOException {
       /* Files.createFile(Path.of("readme.txt"));*/ // создание файла при 2 запуске ошибка правильно ниже
        if (!(Files.exists(Path.of("readme.txt")))){   // проверяем если наш файл не существует
            Files.createFile(Path.of("readme.txt"));  // тогда создаем файл
        }
       /* Files.delete(Path.of("readme.txt"));    // удаление файла*/
        String str = "Я люблю джава";                       //Запись в файл
        File file = new File("readme.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();
    }
}
