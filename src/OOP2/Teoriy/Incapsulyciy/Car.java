package OOP2.Teoriy.Incapsulyciy;
// ������������ - ��� �������� ���������� �����-�� ������� ��������� �� ������������.
public class Car {
    private int cost;   // ������� ��������� ������ ����� � ������� ��������
    int maxSpeed;       // ������� ��������� ����� � �����
    protected String type;      // package-private + ������������ � ������� �����������
    public int minSpeed;        // ����� �� ���� ���������

    void gas(){
        System.out.println("Faster");
    }
}
