package JC2.Array.Lesson;
// �� ���� �������� ������,����� 2 ����� a � b, ������� ����� ������ � ����������� ���� ��� �����
// � ���������� �� � �� b.
import java.util.Scanner;

public class Lesson777 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();          // ������ ������ �������

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();         // ��������� �������� �������
        }
        int a,b;

        a = scanner.nextInt();
        b = scanner.nextInt();              // ������ ���������� ������ ���������

        if (a>b){
            int temp = b;
            b=a;
            a=temp;                         // ������ ������� ���� ������ ������ 2 (�������)
        }
        int count = 0;                      // �������� ������ ��������� � ���������� �� a �� b
        for (int i = 0; i < n; i++)         // ��������� ��� �������� ������� ��� ���
            if (arr[i]>=a&&arr[i]<=b)       // ������� ������� �� � �� b
                count ++;                   // ��������� ���������� ���������� ��������� �� �������
        int [] arrCopy =new int[count];             // ��������� ����� ������� � ��� ������

        for (int i = 0, j = 0; i < n; i++) {        // ����� ��������� �������� 1�� ��������
            if (arr[i]>=a&&arr[i]<=b){              // ����� ��� �������� � ���������� �� � �� b
                arrCopy[j] = arr[i];                // � ��������� �� � 1�� �������� �� ������
                j++;                                // ��������� ��������
            }
        }
        for (int i = 0; i < count; i++) {                  // ��������� �������� ������ ��������
            System.out.println(arrCopy[i]+" ");             // � ������� �� �� �����
        }

    }
}
