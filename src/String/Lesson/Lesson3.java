package String.Lesson;
// ������ - ������� ������ ����� �� �����, ����� ���������� �������� �� ������
import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("I love java");
        stringBuffer.reverse();             // �������������� ������
        System.out.println(stringBuffer);

        char symbol;
        symbol = stringBuffer.charAt(2);    // ����� ���������� �������� ������
        System.out.println(symbol);

        String str = "I love java";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
    }
}
