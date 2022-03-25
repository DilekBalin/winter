package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        //km birim fiyati : 0,10$
        //10 yasindan kucukse toplam fiyati %50 indirim
        //10 ve 20 yas arasindaysa %10 indirim
        //60 yasindan buyukse %30 indirim
        //gidis donus alirsa %20 indirim
        // bu kosullara gore ucak bileti fiyati hesaplayalim


        Scanner scan = new Scanner(System.in);
        int km, yas, tip;
        System.out.println("Mesafeyi Giriniz: ");
        km = scan.nextInt();
        System.out.println("\nYasinizi Giriniz :");
        yas = scan.nextInt();
        System.out.println("\nYolculuk Tipini Seciniz(1= Tek Gidis, 2=Gidis/Donus): ");
        tip = scan.nextInt();
        double NormalFiyat, yasinIndirimi, tipIndirimi;
        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            NormalFiyat = km * 0.10;
            if (yas < 10) {
                yasinIndirimi = NormalFiyat * 0.5;//indirim oranini hesapladim
            } else if (yas >= 10 && yas <= 20) {
                yasinIndirimi = NormalFiyat * 0.10;
            } else if (yas >= 60) {
                yasinIndirimi = NormalFiyat * 0.30;
            } else {
                yasinIndirimi = 0;
            }
            NormalFiyat -= yasinIndirimi;//fiyat indirimden payimi cikartim
            if (tip == 2) {
                tipIndirimi = NormalFiyat * 0.20;
                NormalFiyat = (NormalFiyat - tipIndirimi) * 2;
            }
            System.out.println("Bilet Tutari: " + NormalFiyat + "$");
        } else {
            System.out.println("Girdiginiz degerler yanlis lutfen tekrar deneyiniz!");
        }
    }
}
