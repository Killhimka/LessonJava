package JC2.Array.Lesson;
// ������� ��� ���������� �������� �� �������
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();                      // ��������� ���������� �������

        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        scanner.close();                                // ��������� ������

        boolean ifAlone = true;                         // ������� ���������� �����
        for (int i = 0; i < n; i++) {                   // ������� ������� 1
            for (int j = 0; j < n; j++) {               // ������� ������� 2
                if (arr[i]==arr[j]&&i!=j)    // ������� �������: ���� 2 ����� ��������� ����� ����� � 1 �� ���������
                    ifAlone = false;                //����� ��������
            }
            if (ifAlone){                       // ����� �����
                System.out.println(arr[i]);
            }
            ifAlone = true;                     // ��� ��� ��� ������� �������� ������

        }
    }
}
