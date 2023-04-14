package OOP2.HwOOP2.Hw3;

import java.util.Scanner;

public class Circle {               // круг
    float p = (float) 3.14;

    private float radius;           // Радиус
    private float area;             // Площадь
    private float circumference;    // Длинна окружности

    public Circle(float radius) {
        this.radius = radius;
    }
    void setCircumference(){
        if (radius>0) {
            circumference=radius*radius*p;
            System.out.println("Площать окружности: " + circumference);
        }else System.out.println("No");
    }
    void setArea(){
        if (radius>0){
            area=radius*2*p;
            System.out.println("Диаметр окружности: " + area);
        }   else System.out.println("No");
    }
}
