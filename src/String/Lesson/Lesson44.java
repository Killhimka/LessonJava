package String.Lesson;

import java.util.Locale;

// Замена в подстроке. Вывод указанных элементов. Верхний и нижний регистр.
public class Lesson44 {
    public static void main(String[] args) {
        String str_1 ="  Hello world  ";
        String str_2 = "I love java";
        String str_3 = str_1.replace('l','z'); // Замена одной буквы на другую в строке
        String str_4 = str_1.trim(); // Удаляет начальные и конечные пробелы

        System.out.println(str_3);
        System.out.println(str_4);
        System.out.println(str_1.substring(5)); // Выводит строку начиная с указанного индекса или через -
                                                // через запятую от указанного до указанного индекса
        System.out.println(str_1.toUpperCase(Locale.ROOT)); // Все буквы заглавные
        System.out.println(str_1.toLowerCase(Locale.ROOT));  // Все буквы в нижнем регистре
    }
}
