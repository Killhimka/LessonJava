package String.Practical;
// ¬ведите вашь IP адрес из 4 цыфр, проверка верный ли ввод.
import java.util.Scanner;

public class SP4 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();

        String[] strArr = new String[4];
        strArr = str.split(",");

        if (strArr.length==4){
            for (int i = 0; i < strArr.length; i++) {
                int temp = Integer.valueOf(strArr[i]);
                if (temp>=0&&temp<=300)
                    System.out.println("Correct");
                else System.out.println("No correct");
                break;
            }
        } else System.out.println("no correct");
    }
}
