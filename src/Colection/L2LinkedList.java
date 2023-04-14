package Colection;

import java.net.CacheRequest;
import java.util.LinkedList;

public class L2LinkedList {
        String model;

    public L2LinkedList(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        L2LinkedList audi = new L2LinkedList("a8");
        L2LinkedList ford = new L2LinkedList("Kuga");
        L2LinkedList reno = new L2LinkedList("Talisman");
        L2LinkedList mitsubishi = new L2LinkedList("Galant");
        L2LinkedList toyota = new L2LinkedList("Corolla");

        linkedList.add(audi);
        linkedList.add(reno);
        linkedList.add(toyota);
        System.out.println(linkedList);

        linkedList.addLast(mitsubishi);
        linkedList.addFirst(ford);
        System.out.println(linkedList);

        System.out.println(linkedList.peekLast());// возвращает 1 и последний элемент из списка, не удаляя его
        System.out.println(linkedList.peekFirst());

        System.out.println(linkedList.pollLast());// Возвращает 1 и последний элемент из списка и удаляет его из списка
        System.out.println(linkedList.pollFirst());
    }

    @Override
    public String toString() {
        return "L2LinkedList{" +
                "model='" + model + '\'' +
                '}';
    }
}
