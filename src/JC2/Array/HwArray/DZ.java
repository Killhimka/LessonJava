package JC2.Array.HwArray;
// Вывести четные или нечетные числа с введенных
import java.util.Scanner;

public class DZ {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел которые нужно отсортировать:");
        n = scanner.nextInt();

        int [] arr = new int[n];
        System.out.println("Введите ваши числа:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Введите четное или нечтное число для вывода нужных вам чисел:");
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
