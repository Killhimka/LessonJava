package JC.Lesson;

import java.util.Scanner;

// ������� ����������� ������ � ����� ������
public class lesson3 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        scanner.close();
        int sun = x+y;
        if (sun%2==0){
            System.out.println("������ ������ - �����");
        }   else {
            System.out.println("������ ������ - ������");
        }
    }
}
