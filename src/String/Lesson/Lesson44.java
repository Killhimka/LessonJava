package String.Lesson;

import java.util.Locale;

// ������ � ���������. ����� ��������� ���������. ������� � ������ �������.
public class Lesson44 {
    public static void main(String[] args) {
        String str_1 ="  Hello world  ";
        String str_2 = "I love java";
        String str_3 = str_1.replace('l','z'); // ������ ����� ����� �� ������ � ������
        String str_4 = str_1.trim(); // ������� ��������� � �������� �������

        System.out.println(str_3);
        System.out.println(str_4);
        System.out.println(str_1.substring(5)); // ������� ������ ������� � ���������� ������� ��� ����� -
                                                // ����� ������� �� ���������� �� ���������� �������
        System.out.println(str_1.toUpperCase(Locale.ROOT)); // ��� ����� ���������
        System.out.println(str_1.toLowerCase(Locale.ROOT));  // ��� ����� � ������ ��������
    }
}
