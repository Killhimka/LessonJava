package Colection;


import java.util.ArrayList;

public class L1ArrayList {
    public static void main(String[] args) {
        ArrayList collection = new ArrayList();

        collection.add(1);
        collection.add("java");
        collection.add("2 2 2");
        collection.add(1);
        collection.add(0,5);

        boolean b = collection.contains("2 2 2");   // ����� �� � ��������� ������ ������
        boolean b1 = collection.isEmpty();          // ��������� ����� �� ���� ���������, false = �� �����
        int i = (int) collection.get(1);            // ����� ���� �� �������
        String i1 = (String) collection.get(2);     // ����� ������� �� �������
        int indOf = collection.indexOf(1);          // ���������� �������� �� ������� �������
        collection.remove("java");               // �������� �������� ��� �� �������, ��� ������ �� �������,
                                                    // ������������ � �������� � ������� ������ 1 ������
 //       collection.clear();         // ������� ��� ���������

        System.out.println(collection);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(collection.get(2));
        System.out.println(i);
        System.out.println(i1);
        System.out.println(indOf);
    }

}
