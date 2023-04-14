package JC2.Array.Lesson;
// Ќа ввод подаетс€ массив,далее 2 числа a и b, создать новый массив и скопировать туда все числа
// в промежутке от а до b.
import java.util.Scanner;

public class Lesson777 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();          // задаем размер массива

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();         // считываем элементы массива
        }
        int a,b;

        a = scanner.nextInt();
        b = scanner.nextInt();              // задаем промежуток нужных элементов

        if (a>b){
            int temp = b;
            b=a;
            a=temp;                         // мен€ем местами если первое больше 2 (пузырек)
        }
        int count = 0;                      // объ€вили щетчик элементов в промежутке от a до b
        for (int i = 0; i < n; i++)         // считываем все элементы массива еще раз
            if (arr[i]>=a&&arr[i]<=b)       // услови€ щетчика от а до b
                count ++;                   // добавл€ем количество подход€щих элементов со щетчика
        int [] arrCopy =new int[count];             // объ€вл€ем новый счетчик и его размер

        for (int i = 0, j = 0; i < n; i++) {        // вновь считываем элементы 1го счетчика
            if (arr[i]>=a&&arr[i]<=b){              // берем все элементы в промежутке от а до b
                arrCopy[j] = arr[i];                // и переносим их с 1го счетчика во второй
                j++;                                // добавл€ем элементы
            }
        }
        for (int i = 0; i < count; i++) {                  // считываем элементы нового счетчика
            System.out.println(arrCopy[i]+" ");             // и выводим их на экран
        }

    }
}
