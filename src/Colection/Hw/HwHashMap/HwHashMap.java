package Colection.Hw.HwHashMap;

import java.util.*;

public class Main {
    static class Product{
        int cena;
        String name;

        public Product(int cena, String name) {
            this.cena = cena;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "cena=" + cena +
                    ", name=" + name +
                    '}';
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(10,"Молоко Майонез Хлеб");
        hm.put(5,"Сок Кефир");
        hm.put(15,"Сметана Колбаса Грибы");
        Product product = new Product(10,"Бананы");
        if (hm.containsKey(product.cena)){
            hm.put(product.cena, hm.get(product.cena).concat(" "+product.name));
            String[] sort = hm.get(product.cena).split(" ");
            Arrays.sort(sort);
            hm.put(product.cena,Arrays.toString(sort));
        }   else hm.put(product.cena, product.name);

        System.out.println(hm);
    }
}
