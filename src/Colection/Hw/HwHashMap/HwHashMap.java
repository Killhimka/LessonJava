package Colection.Hw.HwHashMap;

import java.util.*;

public class HwHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        String hm1 = String.valueOf(new HashMap());
        hm.put(3,"������");
        hm.put(2,"�����");
        hm.put(3,"����");
        hm.put(4,"�����");
        hm.put(4,"�������");

        List<HashMap> list = new ArrayList<>(Arrays.asList(hm));
        System.out.println(hm.remove(3));
        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
    }
}
