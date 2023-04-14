package JC.HWJCr;
// 3 числа отсортированы по возростанию (ѕузырьком)
import java.util.Arrays;
import java.util.Scanner;
public class T7task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr [] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                if (arr[i]>arr[j]){
                    int n = arr[j];
                    arr[j] = arr[i];
                    arr [i] = n;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}