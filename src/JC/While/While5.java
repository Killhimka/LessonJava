package JC.While;

import java.util.Scanner;
// ���������� ����� � �������
public class While5 {
    public static void main(String[] args) {
        int number, power;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        power = scanner.nextInt();
        scanner.close();

        // 2 ������� ����� �������
      //count = 1;
        int temp = number;
        while (power!=1){ //(count != power)
            number *= temp;
            power-=1; // count += 1;
        }
        System.out.println(number);
    }
}
