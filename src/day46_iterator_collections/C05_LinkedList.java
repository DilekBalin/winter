package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        // LinkedList hem List, hem de Queue'nun child class'idir
        //list. deyince llist de olan tum methodlar gelir ve ekstradan baska method lar da vardir
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10); // add method'u List'den geldigi icin hep sona ekler
        list.addFirst(11); // addFirst de Queue'den gelir
        list.addLast(12); // addLast de "Queue"den gelir
        System.out.println(list);
        list.add(2,25);
        System.out.println(list); //araya da eleman ekleyebiliriz
    }
}

