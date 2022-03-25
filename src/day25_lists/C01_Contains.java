package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harfler =new ArrayList<>();
        harfler.add("D"); //[D]
        harfler.add("M"); //[D, M] //eger ozel bir sey istemesek M'yisona ekler
        harfler.add(1,"T"); //[D, T, M]
        harfler.add(0,"T");//[T, D, T, M]   //Java virgulden sonra hep bir bosluk bırakır
        System.out.println(harfler);

        harfler.contains("T"); //true dondurur ama ben goremem cunku ne bir atama yaptım ne de yazdırdım
        System.out.println(harfler.contains("T"));//true  dondurmesi icin yazdırdık
        System.out.println(harfler.contains("F"));//false


        List<String> karakterler =new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        System.out.println(harfler.containsAll(karakterler));//true  //harfler listesi karakterler listesini iceriyor mu ///sıra onemli degil

        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler)); //false

        //tumu aradıgımız yerde var mi sorusunun cevabını arıyoruz

         }
}
