package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin


        int sayiAdedi=3;
        Scanner scan = new Scanner(System.in);   //obje olusturduk

        //Java'sa obje veya variable olusturmayı loop icinde yapmayın
        //cunku her sefrinde yenisini olusturmak ramidoldurur

        int sayi=0;
        int toplam=0;
        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;   //sayıyı toplama ekledik
        }
        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);


        // while ile yapalim

        sayi=0;
        toplam=0;  //bu iki islemi yapmazsak kaldıgı yerden devam eder

        int sayac=1; //Whıle loop conditionu saglayacak bir sayac lazım

        while (sayac<=sayiAdedi){// bu sart oldugu muddetce yine kullanıcıdan deger istyecek
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++; //burayı artırmayı ya da azaltmayı unutma  sonsuz dongu olmaasın diye
        }
        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);
    }
}
