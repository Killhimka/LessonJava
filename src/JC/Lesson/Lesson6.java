package JC.Lesson;
// ������������ ���������
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();

        if (x>0&&y>0){
            System.out.println("����� [ " + x + ", " + y + " ] - ����������� 1 ��������.");
        }   else if (x<0&&y>0){
            System.out.println("����� [ " + x + ", " + y + " ] - ����������� 2 ��������.");
        }   else if (x<0&&y<0){
            System.out.println("����� [ " + x + ", " + y + " ] - ����������� 3 ��������.");
        }   else {
            System.out.println("����� [ " + x + ", " + y + " ] - ����������� 4 ��������.");
        }
    }
}
