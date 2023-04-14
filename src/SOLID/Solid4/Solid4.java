package SOLID.Solid4;
// ��� ������ �� ����, ���������� ����������

public class Solid4 {
    public static void main(String[] args) {

    }
}
class Line implements Shape {
    @Override
    public void drawLine() {
        System.out.println("��������� �����");
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
        System.out.println("��������� �����");
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
        System.out.println("��������� ��������������");
    }
}
    interface Shape {
        void drawLine();

        void drawCircle();

        void drawRect();
    }
