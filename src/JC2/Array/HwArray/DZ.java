package JC2.Array.HwArray;
// ������� ������ ��� �������� ����� � ���������
import java.util.Scanner;

public class DZ {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���������� ����� ������� ����� �������������:");
        n = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("������� ���� �����:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("������� ������ ��� ������� ����� ��� ������ ������ ��� �����:");
        int a;
        a = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0){
            }   else if (a%2!=0)
                System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]%2!=0){
            }   else if (a%2==0)
                System.out.print(arr[i]+" ");
        }

    }
}
