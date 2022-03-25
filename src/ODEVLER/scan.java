package ODEVLER;

import java.io.InputStream;
import java.util.Scanner;

public class scan {
    public scan(InputStream in) {
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);






        //TASK6 Kullanicidan ismini ve soy ismini alip aralarinda bir bosluk birakarak asagidaki sekilde yazdirin
        //Isim -soyAdiniz: Mehmet Bulutluoz
        System.out.println("Lutfen isminizi ve soyisminizi girin");
        String isim= scan.nextLine(),soyAdiniz=scan.nextLine();
        System.out.println("Kullanici ismi-soyIsim:" + isim + soyAdiniz);



        System.out.println("Lutfen adinizi giriniz");
        String ad=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz " );
        String soyAd=scan.nextLine();
        System.out.println( "Isim : " + isim);
        System.out.println( "Soyadiniz : " + soyAd);
        System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz.");


        //TASK 7
        //Kullanicidan ismini alip 3. harfini yazdirin
        System.out.println("Lutfen isminizi yaziniz");
        String isim1= scan.nextLine();
        System.out.println("Isminizin 3.harfi:" + isim1.charAt(2));









    }
}
