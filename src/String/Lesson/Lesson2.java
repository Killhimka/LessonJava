package String.Lesson;

import java.util.Locale;
// �����������, ������, ���������, ���������, ������ �������, ����������� ���������� ��������
public class Lesson2 {
    public static void main(String[] args) {
        String str = "I love java";
        String str1 = new String("I love java");
        String str2 = "I love java";
        String str3 = "I love java";

        StringBuilder stringBuilder = new StringBuilder("Ja"); //
        StringBuilder stringBuilder1 = new StringBuilder("va"); //
        System.out.println(stringBuilder.append(stringBuilder1)); // ����������� 2 �����

        str3 = str3.replaceAll(" ",""); // �������� 1 ������ �� 2
        System.out.println(str3); //

        System.out.println(str1.equals(str2)); // ���������� ��������� ����� (true)
        System.out.println(str2==str1);   // �������� ��������� ����� (false)
        System.out.println(str.toUpperCase(Locale.ROOT)); // ��� ������ ���������
        System.out.println(str.toLowerCase(Locale.ROOT)); // ��� ������� ������� ��������
        System.out.println(str.length()); // ���������� ������ ������

    }
}
