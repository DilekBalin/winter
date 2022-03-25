package ODEVLER;

import java.util.Scanner;

public class MaasTeklifi {
    public static void main(String[] args) {
        //Kullanicidan maas icin bir teklif isteyin
        //ve asagıdaki degerlere gore bir cevap yazdirin
        //Teklif 80.000 uzerinde ise "Kabul Ediyorum"
        //60-80.000 arasinda ise "Konusabiliriz"
        //60.000 aitında ise "Maalesef kabul edemem"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen maas icin bir teklif giriniz");
        int teklif= scan.nextInt();

        if (teklif>80000){
            System.out.println("Kabul Ediyorum");

        }else if (teklif>=60000) {
            System.out.println("Konusabiliriz");

        }else {
            System.out.println("Maalesef Kabul Edemem");
        }
        }


    }


