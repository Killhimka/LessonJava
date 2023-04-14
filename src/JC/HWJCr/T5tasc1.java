package JC.HWJCr;
// Первые 2 числа цена кг, 2 двойка имеющиеся с собой деньгиб 3е число количество кг
import java.util.Scanner;

public class T5tasc1 {
    public static void main(String[] args) {
        int gold, cent, gold1, cent1, kg;
        Scanner scanner = new Scanner(System.in);
        gold = scanner.nextInt();
        cent = scanner.nextInt();
        gold1 = scanner.nextInt();
        cent1 = scanner.nextInt();
        kg = scanner.nextInt();
        scanner.close();
        int a = (gold*100+cent)*kg, b = gold1*100+cent1;
        if (b>a){
            System.out.println("Вам хватит");
        }   else {
            System.out.println("Не хватит");
        }


    }
}
