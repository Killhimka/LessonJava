package String.Lesson;
// �������� ������ ������
public class Lesson11 {
    public static void main(String[] args) {
        String str_1 ="Hello world";
        String str_2 = "I love java";
        String str_3 = new String();
        String str_4 = new String(new char[]{'H','e','l','l','o'});
        String str_5 = str_1+" "+str_2;             // ����� �����
        str_1 = str_1.concat(str_2);             // ����� ������: ����������� ����� ��� ����������� ����� ����
        String str_6 = String.join(" ", str_1, str_2);// ����������� ����� � ������������ ����� ����
                                                              // �������� �� ��������)) �6

        System.out.println(str_1.length());                 // ������� ������� �������� � ������
        System.out.println(str_2);
        System.out.println(str_3);
        System.out.println(str_4);
        System.out.println(str_5);
        System.out.println(str_1);
        System.out.println(str_6);

    }
}
