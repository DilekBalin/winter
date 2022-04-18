package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_linkedList {
    public static void main(String[] args) {

        /*
        LinkedList'in ik tane parent interface'i vardir
        LinkedList olustururken data turu olarak LinkedList secersek
        iki parent'taki tum method'lar kullanilabilir
        List secersek :sadece List interface'indaki method'lar
        Deque/Queue secersek: Dequ'daki method'ari kullanabiliriz
         */
        LinkedList<Integer> ll1= new LinkedList<>();
        ll1.add(10);  //once Linkedlist classindan calistirir


        //Sadecee List interface'nden ozellikler kullanmak istersek
        //data turunu List yapariz
        List<Integer> ll2=new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);

        //Sadece Deque'den gelen ozellikleri kullanalim
        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);//[15, 20]
        ll3.addLast(40);
        System.out.println(ll3);//[15, 40]

    }
}
