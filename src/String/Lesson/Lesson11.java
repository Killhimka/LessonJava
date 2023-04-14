package String.Lesson;
// Варианты вывода строки
public class Lesson11 {
    public static void main(String[] args) {
        String str_1 ="Hello world";
        String str_2 = "I love java";
        String str_3 = new String();
        String str_4 = new String(new char[]{'H','e','l','l','o'});
        String str_5 = str_1+" "+str_2;             // Метод комка
        str_1 = str_1.concat(str_2);             // Метод канкат: объединение строк без разделителя между ними
        String str_6 = String.join(" ", str_1, str_2);// Объединение строк с разделителем между ними
                                                              // Почемуто не работает)) №6

        System.out.println(str_1.length());                 // Выведет сколько символов в строке
        System.out.println(str_2);
        System.out.println(str_3);
        System.out.println(str_4);
        System.out.println(str_5);
        System.out.println(str_1);
        System.out.println(str_6);

    }
}
