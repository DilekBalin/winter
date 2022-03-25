package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        //boyutları belirli bir array'i elementelre girmeden olustrulaım
        ///bir olkulda icinde 24 ogrenci olan 8 sınıf vardir

        int arr [][]=new int[8][24];   // 8 class ve 24 ogrenci

        //Bir ilcede her birinde 24 ogrencilik 8 sınıf bulunan 5 okul vardır
        int ilce [][][]=new int[5][8][24];  // 5 okul,8 sınıf ve 24 ogrenci

        //Bir okulda 3 tane 24 kisilik 2 tane de 22 kisilik sınıf vardır>>> bunu yapamayız
        //cunku arraylerde toplama ve cıkarma yok
        //farkli boyutlardaki arrayleri tek seferde olusturamayız
        //bunun yerine 2 array yapabiliriz

        int sinif24[][] =new int [3] [24];
        int sinif22 [][] =new int [2] [22];

        //olustururken elemetleri atama yaparsak farklı uzunlukta inner arrayler tanımlayabiliriz
        int arr1 [][]={{3,1,5},{6,10}};
    }
}
