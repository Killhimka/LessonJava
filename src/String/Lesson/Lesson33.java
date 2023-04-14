package String.Lesson;
// Сравнение строк
public class Lesson33 {
    public static void main(String[] args) {
        String str_1 ="Hello world";
        String str_2 = "I love java Hello world";
        System.out.println(str_1.equals(str_2));    // Проверка одинаковые ли строки вывод true end false

        int ind = str_1.indexOf('l');    // Выводит индекс 1 вхождения элеиента в строку указанной подсмтроки
        int ind1 = str_1.lastIndexOf('l'); // Индекс последнего вхождения элеиента в строку
        System.out.println(ind);
        System.out.println(ind1);

        boolean str = str_1.startsWith("Hello"); // Узнать является ли слово первым в строке
        System.out.println(str);
        boolean str1 = str_1.endsWith("world"); // Узнать является ли слово последним в строке
        System.out.println(str1);

    }
}
