package JC.Lesson;
// ����������� ������� �����
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        int hours;
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        scanner.close();
        if (hours>=6&&hours<=11)
            System.out.println("����");
           else if (hours>11&&hours<=18)
            System.out.println("����");
           else if (hours>18&&hours<=22)
            System.out.println("�����");
           else
            System.out.println("����");


    }
}
