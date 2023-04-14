package OOP.Hw.Hw2;

import java.util.Scanner;

public class Student2 extends Student{
    Scanner scanner = new Scanner(System.in);
    int password;
    int password2;

    void setPassword(){
        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextInt();
            System.out.print("Повторите пароль: ");
            password2 = scanner.nextInt();
            if (password == password2) ;
            else System.out.println("Пароли не совпадают");
        } while (password!=password2);
    }
}
