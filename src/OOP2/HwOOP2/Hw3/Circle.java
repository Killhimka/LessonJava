package OOP2.HwOOP2.Hw3;

import java.util.Scanner;

public class Circle {               // ����
    float p = (float) 3.14;

    private float radius;           // ������
    private float area;             // �������
    private float circumference;    // ������ ����������

    public Circle(float radius) {
        this.radius = radius;
    }
    void setCircumference(){
        if (radius>0) {
            circumference=radius*radius*p;
            System.out.println("������� ����������: " + circumference);
        }else System.out.println("No");
    }
    void setArea(){
        if (radius>0){
            area=radius*2*p;
            System.out.println("������� ����������: " + area);
        }   else System.out.println("No");
    }
}
