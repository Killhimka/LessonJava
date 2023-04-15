package Colection.Hw.HwHashMap;

import java.util.*;

public class HwHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String[]> hm = new HashMap<>();

        String[] prays10 = new String[]{"Молоко Кефир Свекла Морковь"};
        String[] prays20 = new String[]{"Хлеб Бананы"};
        String[] prays30 = new String[]{"Батон Багет Тоты Лаваш"};
        String[] prays40 = new String[]{"Сметана"};
        String[] prays50 = new String[]{"Кефир Ряженка Майонез Сироп"};

        hm.put(10, prays10);
        hm.put(20, prays20);
        hm.put(30, prays30);
        hm.put(40, prays40);
        hm.put(50, prays50);


        for (Map.Entry<Integer,String[]>entry: hm.entrySet()) {
            int a = entry.getKey();
            System.out.println("----------------------");
            System.out.println("Весь товар стоимостью: "+a);
            for (String s1: entry.getValue()){
                System.out.println(s1);
            }
        }
    }
}
