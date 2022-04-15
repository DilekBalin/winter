package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class  C03_Remove {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(5); //[5]
        sayilar.add(3);  //[5,3]
        sayilar.add(0,7);//[7, ,5, 3]
        sayilar.add(2,7);  //[7, 5, 7, 3]

        sayilar.remove(3);  //integer oldugu icin 3 dedigimizde 3.indexteki elementi siler
       // sayilar.remove(5); indexOutOfException

        /*
        Sayilardan olusan bir list'de objeyi vererek element silme method'u calismaz
        sayi degeri girdigimizde Java otomatik olarak index kabul eder.
         */

        //int sayi=5;
        //sayilar.remove(5);  //indexOutOfException

        Integer sayi=5;
        sayilar.remove (sayi);
        System.out.println(sayilar); //[7,7]   //Integer wrapper class'ı kullanınca sayi obje oldugundan bu method calıstı

        //sayilar.remove(Integer.valueOf("5"));






        //int sayi=5;
       // sayilar.remove(sayi); IndexOfBoundsException

        sayilar.remove(sayi);
        System.out.println(sayilar);//[7, 7]
    }
}
