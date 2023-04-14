package String.Lesson;
// Вывод определенных символов из строки
public class Lesson22 {
    public static void main(String[] args) {
        String str_1 ="Hello world";
        String str_2 = "I love java";
        char c = str_1.charAt(2);       // Вывод определенного символа

        int start = 0;          // Начало отсчета символов
        int end = 5;            // Конец отсчета
        char[] arr = new char[end - start];     // Отсчитаем символы в массиве
        str_1.getChars(start, end, arr, 0); // Используем строку из которой будем извлекать символы -
                                                    // указываем 4 параметра: начало, конец, массив и 0 -
                                                    // число с которого начинать отсчет

        System.out.println(c);
        System.out.println(arr);

    }
}
