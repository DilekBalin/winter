package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List'ten gelen ozellikleri biliuoruz
        //onun icin Deque'den gelen ozelliklere bakalim

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10); //Basa eleman ekler
        ll1.addLast(20); //Sona element ekler add() e gore daha hizlidir
        System.out.println(ll1);//[10, 20]
        System.out.println(ll1.element());//10  //ilk elementi silmeden bize getirir
        //ilk element yoksa exception firlatir
        System.out.println(ll1); //[10, 20]
        System.out.println(ll1.getLast());//20    //silmeden  son elementi getirir
        System.out.println(ll1.getFirst()); //10  >> silmeden ilk elementi getiririr
        ll1.offer(30);// [10, 20, 30] //sona ekler ama bize bir sey dondurmez
        ll1.offerLast(40);//sona ekler ve bize true dondurur
        ll1.offerFirst(50);
        System.out.println(ll1); //[50, 10, 20, 30, 40]
        System.out.println(ll1.peek()); //50>>>   ilk elementi silmeden verir bulamazsa null dondurur
        System.out.println(ll1.poll()); //50


    }
}