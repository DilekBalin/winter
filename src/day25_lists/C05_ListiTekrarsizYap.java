package day25_lists;

import java.util.ArrayList;
import java.util.List;

import static day25_lists.C04_ListedenTekrarliElementleriSilme.tekrarsizListeOlustur;

public class C05_ListiTekrarsizYap {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        sayilar= tekrarsizListeOlustur(sayilar);  //sayılar listimin degisimini kalıcı hale gelmesini istedigim icin atama yaptım
        //ve listemin orijinali gormek istedim
        System.out.println(sayilar);  //bununla degismi gorebiliriz
    }
    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){ //sayıyı aldım ve icermiyorsa yazdırcam
                tekrarsizList.add(sayilar.get(i));
            }
        }
        return tekrarsizList;

    }
}
