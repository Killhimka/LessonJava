package Colection.Hw.HwHashMap;

import java.util.*;

public class HwHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        String hm1 = String.valueOf(new HashMap());
        hm.put(3,"Молоко");
        hm.put(2,"Кефир");
        hm.put(3,"Хлеб");
        hm.put(4,"Батон");
        hm.put(4,"Сметана");

        List<HashMap> list = new ArrayList<>(Arrays.asList(hm));
        System.out.println(hm.remove(3));
        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
    }
}
