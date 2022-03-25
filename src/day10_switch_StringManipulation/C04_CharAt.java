package day10_switch_StringManipulation;

import java.util.Locale;

public class C04_CharAt {

    public static void main(String[] args) {

        //String'te herhangi bir karakteri almak istedigimizde
        // o harfin indeksini kullanarak str.charAt(istenen index) yazabilirz

        String str="Java cok Guzel";
        //J'yi yani ilk harfi yazdıralım
        System.out.println(str.charAt(0));

        //Eger G'yi yazdırmak istiyorsanız
        System.out.println(str.charAt(9)); //boslukları da saymak zoeundayız cunku bosluk da bir karakterdir

        // va yazdiralım
        System.out.println(str.charAt(2)+str.charAt(3)); //215 // Ascıı degerleri devreye giree
        System.out.println(""+ str.charAt(2)+str.charAt(3)); // va // basına bosluk koy String algılasın

        //cOK seklinde yazdıralım
        //System.out.println( str.charAt(6).);  // artık method gelmiyo
        //Str bir String oldugu icin methodlar geliyordu ve charAt yazınca method'lar char olarak geliyordu
        //toLowecase ya da toUpercase' leri Strşnd'ten once yapmalıyız

        System.out.println(  ""+str.toLowerCase().charAt(5)+
               str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));


        //son harfi yazdır
        // String'te 14 karakter var,son harfin index'i 14-1

        System.out.println( str.charAt(14-1)); // son harf>>>>  Uzunluk-1

        //İndex ile harf aynı degildir,index 0'dan baslar saymaya

        //Eger uzunlugu index olarak girersek
                       //System.out.println(str.charAt(14));// hata verdi
        //index olmanız gereken aralıgın dısına cıkar














    }
}
