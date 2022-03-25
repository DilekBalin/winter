package ODEVLER;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        //kullanicidan artik yil kontrolu icin yil degeri alin
        //4 ile bölünemeyen yillar artik yil deggildir
        //4 ile bölünüp 100 ile bölünemeyen yillar artik yildir
        //4'ün katlarindan 100'bölünenlerden sadece 400'ün katlari artik yildir

        Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen bir yil degeri yaziniz");
        double yil=scan.nextDouble();
        if (yil>0) {
            if (yil % 4 != 0) {
                System.out.println("Girdiginiz yil artik yil degildir");
            } else if (yil % 4 == 0 && yil % 100 != 0) {
                System.out.println("Girdiginiz yil artik yildir");
            } else if (yil % 4 == 0 && yil % 100 == 0 && yil % 400 == 0) {
                System.out.println("Girdiginiz yil artik yildir");
            }else{
                System.out.println("Girdiginiz yil artik yil degildir");
            }
        } else {
            System.out.println("Lütfen gecerli bir deger giriniz");
        }
        }
}
