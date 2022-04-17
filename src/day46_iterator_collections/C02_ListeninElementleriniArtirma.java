package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {

        //Verilen listedeki her elementi 3 artirin
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);  //// [5, 7, 8, 6, 9]

        /*
        Listenin tum elementlerini bize getirmesi icin
        iterator'in hasNext() ve next() methodlarini kullanacagiz
                */

       // Iterator itr = liste.iterator();
      //  while(itr.hasNext()){ // yaninda element oldugu muddetce calisacak
           // System.out.println(itr.next()); //bu method hem yazdiracak hem de yanindaki elemente gececek

            //basa gelecek tum elementlere bitene kadar
            //Biz bu ornekte sadece elementlerin uzerinde gezinebildik herhangi bir ekleme cikarma yapamayiz
            //cunku iterator'de set() methodu yoktur

        ListIterator itr = liste.listIterator();
        while(itr.hasNext()){
            Object sayi= itr.next();//hem siradaki sayiya gidecek hem de onu sayi'ya atayacak
            itr.set((Integer)sayi+3); //integer casting yaptik
        }
        System.out.println(liste);  //[8, 10, 11, 9, 12]
    }
}