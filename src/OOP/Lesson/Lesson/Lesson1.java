package OOP.Lesson.Lesson;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

// �������� ������/�������� �������/ �������� new/ �������� ������ / ��������(��������) � ��� �����
        Scanner scanner = new Scanner(System.in);       //������ ������ ������
//����� / ������� ������ / new
        Pet pet = new Pet(2,"rex");
        pet.makeSound();                // �������� ����� ��� � ������ Lesson1
    }
}
