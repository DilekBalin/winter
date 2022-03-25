package ODEVLER;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {

       //TASK 1
        //kullanicidan iki tam sayi alip
        //bu sayilarin toplam,fark ve carpimlarini yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz ");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci bir tam sayi giriniz");
        int sayi2= scan.nextInt();

        System.out.println("girdiginiz sayiar:"+ sayi1+"," +sayi2);
        System.out.println("girdiginiz sayilarin toplami:"+ (sayi1+ sayi2) );
        System.out.println("girdiginiz sayilarin farki:" + (sayi1-sayi2));
        System.out.println("girdginiz sayilarin carpimi:"+ sayi1*sayi2);



        //TASK 2
        //Kullanicidan karenin bir kenar uzunlugunu alin
        ///karenin cevresi ve alanini yazdirip hesaplayin

        System.out.println("lutfen karenin bir kenarini yaziniz");

        int sayi3= scan.nextInt();
        System.out.println("Karenin Cevresi:"+ sayi3*4);
        System.out.println("Karenin Alani:" + sayi3*sayi3);


        //TASK 3
        //Kullanicidan yaricap isteyip cemberin cevresini ve
        // dairenin alanini hesaplayiniz.

        System.out.println("Lutfen bir yaricap giriniz");
        double yariCap= scan.nextInt();

        System.out.println( "cemberin cevresi:"+ "" + 2*yariCap*3.14);
        System.out.println("dairenin alani:" +yariCap*yariCap*3.14);


        //TASK 4
        // Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini
        //ve yuksekligini isteyip
        //prizmanin hacmini hesaplayin

        System.out.println("Lutfen dikdortgenler prizmasinin uzun, kisa kenarlairni ve yukekligini yaziniz");
        int uzun= scan.nextInt(), kisa= scan.nextInt(), yukseklik=scan.nextInt();
        System.out.println("Prizmanin hacmi : " + uzun*kisa*yukseklik);

    }
}
