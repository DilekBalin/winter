package day33_varrags_stringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {

        /*Compare iki stBuilderi esit mi diye kontrol etmek icin
        ilk harften baslyarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz
        farkli olan karakterler icin ASCII tablosuna gore kac deger geride veya ileride oldugunu yazdirir
        Tamamen ayni ise bize 0 dondurur

        bir st/builder ile bir stringi compare etmek istersek Java CTE verir
         */

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Ean");

        String str="Ali Can";
        System.out.println(sb1.compareTo(sb2));
       // System.out.println(sb1.compareTo(str));
    }
}
