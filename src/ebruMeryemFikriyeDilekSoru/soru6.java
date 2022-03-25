package ebruMeryemFikriyeDilekSoru;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


 Scanner scan=new Scanner(System.in);
        System.out.println("Y ya da N yaziniz.");
        char harf1=scan.next().charAt(0);
        char harf2 =scan.next().charAt(0);

        if(harf1=='Y'){
            System.out.println("cevabiniz: yes");

        }else if (harf2=='N'){
            System.out.println("cevabiniz: no");

        }else {
            System.out.println("Hatali giris");





    }
}
}
