package Файлы.Hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sdfg {
    public static void main(String[] args) {
        int c;
        String a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        a = scanner.nextLine();
        System.out.println("Введите вашу фамилию: ");
        b= scanner.nextLine();
        System.out.println("Введите ваш номер телефона: ");
        c = scanner.nextInt();
        scanner.close();

        System.out.printf("Пользователя зовут %s ",a);
        System.out.printf("Фамилия пользователя %s ",b);
        System.out.printf("Номер телефона %d ",c);

    }

}
