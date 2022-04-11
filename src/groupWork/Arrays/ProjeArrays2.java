package groupWork.Arrays;

public class ProjeArrays2 {
    public static void main(String[] args) {
/*
     bir sinifa ait ders notlari verilmis,basarili ogrencilerin not ortalamalarini bulunuz
     50 ve yukari not alan ogrenciler basarili sayilmaktadir
     input ={50,44,65,95,85,30,20,90,30}
   */



        int[] puan = new int[]{50,44,65,95,85,30,20,90,30};

        int toplam = 0;
        double avarage;
        int basariliSayisi = 0;

        for (int i = 0; i <puan.length; i++) {
            toplam += puan[i];
        }
        avarage = toplam * 1.0 / puan.length;//kesirli sayi olarak almak icin 1.0 ile carp
        for (int i = 0; i < puan.length; i++) {
            if (puan[i]>=50) {
                basariliSayisi++;
            }
        }
        System.out.println(avarage);
        System.out.println("ortalamayi bulan ve asan ogrenci sayisi : " + basariliSayisi);



    }
}
