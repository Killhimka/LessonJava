package SOLID.Solid4;
// Так делать не надо, реализация интерфейса

public class Solid4 {
    public static void main(String[] args) {

    }
}
class Line implements Shape {
    @Override
    public void drawLine() {
        System.out.println("Рисование линии");
    }

    @Override
    public void drawCircle() {

    }

    @Override
    public void drawRect() {

    }
}
class Circle implements Shape {
    @Override
    public void drawLine() {

    }

    @Override
    public void drawCircle() {
        System.out.println("Рисование круга");
    }

    @Override
    public void drawRect() {

    }
}
class Rect implements Shape {
    @Override
    public void drawLine() {

    }

    @Override
    public void drawCircle() {

    }

    @Override
    public void drawRect() {
        System.out.println("Рисование прямоугольника");
    }
}
    interface Shape {
        void drawLine();

        void drawCircle();

        void drawRect();
    }
