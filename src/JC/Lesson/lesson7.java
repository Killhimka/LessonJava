package JC.Lesson;

import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        if (number<10){
            System.out.println("�����");
        }   else if (number<100){
            System.out.println("�����������");
        }   else {
            System.out.println("�����������");
        }
    }
}
