package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C03_RetainAll {

    //Queue icin ayirici ozellik: elemanlar en sona eklenir ve en bastan silinir
    //Deque elemanlar hem onden hem sondan ekleme yapilabilir
    //deque null kabul etmez

    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        set1.add(10);
        set1.add(20);
        set2.addAll(set1);
        set2.add(25);
        set2.add(30);
        set2.add(40);
        System.out.println(set1); //[20, 10]
        System.out.println(set2); //[20, 40, 25, 10, 30]

        System.out.println(set2.retainAll(set1)); //true  set1'in tum elementlerini buldu ve onun disindakileri sildi
        System.out.println(set1); //[20, 10]
        System.out.println(set2);  ////[20, 10]

    }
}
