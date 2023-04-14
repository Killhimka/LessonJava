package JC.Switch;

import java.util.Scanner;

// JC.Switch и тернарный оперратор
public class Switch4 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        switch (number){
            case 0:
                System.out.println("Null");
                System.exit(1);
                break;
        }
        System.out.println(number>0?"Positive":"Negative");
    }
}
