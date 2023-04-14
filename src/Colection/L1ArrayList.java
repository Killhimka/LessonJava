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

        boolean b = collection.contains("2 2 2");   // лежит ли в коллекции данная строка
        boolean b1 = collection.isEmpty();          // Проверяем пуста ли наша коллекция, false = не пуста
        int i = (int) collection.get(1);            // копия инта по индексу
        String i1 = (String) collection.get(2);     // копия стринга по индексу
        int indOf = collection.indexOf(1);          // вычисление элемента по первому индексу
        collection.remove("java");               // удаление элемента или по индексу, или стринг по образцу,
                                                    // чувствителен к регистру и удаляет только 1 стринг
 //       collection.clear();         // удаляет всю коллекцию

        System.out.println(collection);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(collection.get(2));
        System.out.println(i);
        System.out.println(i1);
        System.out.println(indOf);
    }

}
