package OOP2.Teoriy.GetterSetter;
// Sett - (c �����������) ���������� (������������� �����-�� ��������)
// Get - (� �����������) �������� (�������� ����� �� ��������)
public class Car {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed<=300) {
            this.maxSpeed = maxSpeed;
        }
        else System.out.println("������������ �������� ��������");
    }
}
