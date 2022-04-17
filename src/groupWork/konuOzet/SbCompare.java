package groupWork.konuOzet;

public class SbCompare {
    public static void main(String[] args) {

        /*Compare iki stBuilderi esit mi diye kontrol etmek icin
        ilk harften baslyarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz
        farkli olan karakterler icin ASCII tablosuna gore kac deger geride veya ileride oldugunu yazdirir
        Tamamen ayni ise bize 0 dondurur

        bir st/builder ile bir stringi compare etmek istersek Java CTE verir
         */

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Aan");

        String str="Ali Can";
        System.out.println(sb1.compareTo(sb2));
        // System.out.println(sb1.compareTo(str));
        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sb1.equals(sb1)); //true
        // equals false verir cunku iki ayri obje gibi algiladigi icin

        //StringBuilder'da equals methodu == gibi davranir

        System.out.println(sb1.equals(str)); //false
        //System.out.println(sb1==str);//farkli obje turleri oldugu iicn kiyas yapmaz
    }
    }

