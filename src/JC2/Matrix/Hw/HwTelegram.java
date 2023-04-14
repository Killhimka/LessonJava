package JC2.Matrix.Hw;
// На ввод подаются числа: выберите числа по индексу какие вам нужно перемножить.
import java.util.Arrays;
import java.util.Scanner;

public class HwTelegram {
    public static void main(String[] args) {
        int n1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите количество чисел: ");
        n1 = scanner.nextInt();

        System.out.println("Введите ваши числа: ");
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = scanner.nextInt();
        }
        int ind1=0;
        int ind=0;
        System.out.println("Какие числа хотите умножить: ");
        for (int i = 0; i < n1; i++) {
            ind = scanner.nextInt();
            ind -=1;
            break;
            }
        for (int i = 0; i < n1; i++) {
            ind1 = scanner.nextInt();
            ind1-=1;
            break;
            }

            System.out.print("Ответ: "+arr[ind]*arr[ind1]);



    }
}
