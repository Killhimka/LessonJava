package JC2.Array.Lesson;
// Вывести все уникальные элементы из массива
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();                      // считываем количиство массива

        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        scanner.close();                                // считываем массив

        boolean ifAlone = true;                         // создаем переменную булин
        for (int i = 0; i < n; i++) {                   // создаем счетчик 1
            for (int j = 0; j < n; j++) {               // создаем счетчик 2
                if (arr[i]==arr[j]&&i!=j)    // условия щетчика: если 2 цыфры совпадают между собой и 1 не совпадает
                    ifAlone = false;                //тогда неправда
            }
            if (ifAlone){                       // вывод булин
                System.out.println(arr[i]);
            }
            ifAlone = true;                     // все что вне условий счетчика правда

        }
    }
}
