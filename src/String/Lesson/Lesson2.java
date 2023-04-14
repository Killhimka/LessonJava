package String.Lesson;

import java.util.Locale;
// Объединение, замена, сравнение, заглавные, нижний регистр, определение количества символов
public class Lesson2 {
    public static void main(String[] args) {
        String str = "I love java";
        String str1 = new String("I love java");
        String str2 = "I love java";
        String str3 = "I love java";

        StringBuilder stringBuilder = new StringBuilder("Ja"); //
        StringBuilder stringBuilder1 = new StringBuilder("va"); //
        System.out.println(stringBuilder.append(stringBuilder1)); // Объединение 2 строк

        str3 = str3.replaceAll(" ",""); // Заменяет 1 символ на 2
        System.out.println(str3); //

        System.out.println(str1.equals(str2)); // Правильное сравнение строк (true)
        System.out.println(str2==str1);   // Неверное сравнение строк (false)
        System.out.println(str.toUpperCase(Locale.ROOT)); // Все сиволы заглавные
        System.out.println(str.toLowerCase(Locale.ROOT)); // Все символы нижнего регистра
        System.out.println(str.length()); // Нахождение длинны строки

    }
}
