package OOP2.Teoriy.Pereopredelenie;

public class Duck extends Animals {  // ��������                    // Duck - ����
    @Override//- ����������� ��� ����������� - ��������� ������ ������ ���� ����� �� (����������� ������� - void,
    // �������� - makeSound � ������������ �������� System.out.println("����!");) - ������������ Animals.
    // ������ ��������: ��� ������������� �������� ������ ���� ����� ��.
    void makeSound(){
        System.out.println("����!");
    }
}
