package String.Lesson;
// ������� ������ �� ��������� �������� �� ������������� ����������� ( ����� ������ � ������ ������ �� ���������)
public class Lesson55 {
    public static void main(String[] args) {
        String str_1 ="  Hello world world world world  ";
        String[] world = str_1.split(" ");
        for (String word: world){
            System.out.println(word);
        }
    }
}
