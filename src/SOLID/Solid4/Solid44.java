package SOLID.Solid4;
// ������ �������
public class Solid44 {
    public static void main(String[] args) {

    }
}
class Line1 implements Ilain {
    @Override
    public void drowLain() {
        System.out.println("��������� �����");
    }
}
class Circle1 implements ICircle{
    @Override
    public void drawCircle() {
        System.out.println("��������� �����");
    }
}
class Rect1 implements IRect{
    @Override
    public void drowRect() {
        System.out.println("��������� ��������������");
    }
}

    interface Shape1 {
        void draw();
    }

interface Ilain{
    void drowLain();
}
interface ICircle{
    void drawCircle();
}
interface IRect{
    void drowRect();
}