package String.Lesson;
// ��������� �����
public class Lesson33 {
    public static void main(String[] args) {
        String str_1 ="Hello world";
        String str_2 = "I love java Hello world";
        System.out.println(str_1.equals(str_2));    // �������� ���������� �� ������ ����� true end false

        int ind = str_1.indexOf('l');    // ������� ������ 1 ��������� �������� � ������ ��������� ����������
        int ind1 = str_1.lastIndexOf('l'); // ������ ���������� ��������� �������� � ������
        System.out.println(ind);
        System.out.println(ind1);

        boolean str = str_1.startsWith("Hello"); // ������ �������� �� ����� ������ � ������
        System.out.println(str);
        boolean str1 = str_1.endsWith("world"); // ������ �������� �� ����� ��������� � ������
        System.out.println(str1);

    }
}
