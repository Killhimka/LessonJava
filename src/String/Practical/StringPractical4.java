package String.Practical;
// ¬ведите вашь IP адрес из 4 цыфр, проверка верный ли ввод.
import java.util.Scanner;

public class StringPractical4 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();

        String [] strings = new String[4];
        strings = str.split(",");
        boolean ifReal = false;
        if (strings.length==4){
            for (int i = 0; i < 4; i++) {
                int temp = Integer.valueOf(strings[i]);
                if (temp>=0&&temp<256)
                    ifReal = true;
                else {
                    ifReal = false;
                    break;
                }
            }
        } else
            ifReal = false;
        if (ifReal){
            System.out.println("Correct");
        }
        else
            System.out.println("Not correct");
    }
}
