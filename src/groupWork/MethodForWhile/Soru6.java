package groupWork.MethodForWhile;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
         /*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.
       */
        //1 saat=3600 saniye, 1 mil= 1.6 km ve 1kg =1000 gramdir
        Scanner scancan=new Scanner(System.in);
        System.out.print("cevirim yapacagimiz islemi seciniz: ");
        String islem= scancan.next();

        System.out.print("cevirim yapacaginiz miktari giriniz: ");
        double miktar=scancan.nextDouble();
        donustur(islem,miktar);
    }
    private static void donustur(String islem, double miktar) {
        switch(islem){
            case "saat":
                System.out.println(miktar*60*60+ "saniyedir");
                break;
            case "mil":
                System.out.println(miktar*1.60+ "kilometredir");
                break;
            case "kg":
                System.out.println(miktar*1000+ "gramdir");
                break;
            default:
                System.out.println("giridiniz degerler yanlis lutfen tekrar deneyiniz");
        }
    }
    }

