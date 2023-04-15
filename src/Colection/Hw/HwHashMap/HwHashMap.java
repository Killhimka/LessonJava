package Colection.Hw.HwHashMap;

import java.util.*;

public class HwHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String[]> hm = new HashMap<>();

        String[] prays10 = new String[]{"������ ����� ������ �������"};
        String[] prays20 = new String[]{"���� ������"};
        String[] prays30 = new String[]{"����� ����� ���� �����"};
        String[] prays40 = new String[]{"�������"};
        String[] prays50 = new String[]{"����� ������� ������� �����"};

        hm.put(10, prays10);
        hm.put(20, prays20);
        hm.put(30, prays30);
        hm.put(40, prays40);
        hm.put(50, prays50);


        for (Map.Entry<Integer,String[]>entry: hm.entrySet()) {
            int a = entry.getKey();
            System.out.println("----------------------");
            System.out.println("���� ����� ����������: "+a);
            for (String s1: entry.getValue()){
                System.out.println(s1);
            }
        }
    }
}
