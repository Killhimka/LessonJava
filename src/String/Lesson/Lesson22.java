package String.Lesson;
// ����� ������������ �������� �� ������
public class Lesson22 {
    public static void main(String[] args) {
        String str_1 ="Hello world";
        String str_2 = "I love java";
        char c = str_1.charAt(2);       // ����� ������������� �������

        int start = 0;          // ������ ������� ��������
        int end = 5;            // ����� �������
        char[] arr = new char[end - start];     // ��������� ������� � �������
        str_1.getChars(start, end, arr, 0); // ���������� ������ �� ������� ����� ��������� ������� -
                                                    // ��������� 4 ���������: ������, �����, ������ � 0 -
                                                    // ����� � �������� �������� ������

        System.out.println(c);
        System.out.println(arr);

    }
}
