package JC.Lesson;
// ���������� ������ �� 1� ����� � ������� �� ��� �� ������
import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();

        if (a%2!=0){
            System.out.println("�������");
        }   else if (a%b==0){
                System.out.println("�����");
        }       else {
            System.out.println("��");
        }



    }
}
