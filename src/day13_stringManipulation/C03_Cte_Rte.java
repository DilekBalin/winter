package day13_stringManipulation;

public class C03_Cte_Rte {
    public static void main(String[] args) {

       // int sayi=null;     HATA    //int primitive bir data turudur ve null olamaz
       // int sayi="Ali Can"; HATA     int'e String bir deger vermezsin

        //Bunlara syntax  hatalarini java yazdıigimizda gorur ve altını cizer
        //tum projede altı cızılı bır kod varsa
        //projede hicbir class calşsmaz

        String str ="Java'da hersey zamanla oturur";
       // System.out.println(str.substring(5,7,9));       HATA    //Boyle bir method yok

        //java bazı sorunları bazen hemen anlar bazen de islem yapınca anlar

        //bis sayi "Ali Can" olusturduk ve int ile istedik<<<compile hatasi
        //syntax hatalarini java hemen yakalar/
        // system.out.println(str.substring("a")); >>>> methodlarinm dısnına da cıkamaz
        //(compile time error)>>> hata vaerirse o package calısmaz

        System.out.println(str.substring(100));    //normalde hata vermez
        // calıstıktan sonra 100.index olmadıgı icin  hata verir (run time error)
        //bunun icin de konsolda mavi yazan kısımda hatayı acıklar






    }
}
