package halukcaCozumler._08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Topun ilk birakildigi yuksekligi giriniz");
        double yukseklik = scan.nextDouble();
        double toplamYol = 0;//Conyetnir olusturduk toplam yolu bulmak icin
        int ziplamaSayisi = 0;   //yere vurma sayisini yani ziplama saysini bulmak icin baska bir konteynir olustruduk


        //once aksiyon sonra sart var      do while kullanacagiz
        //yani once topu birak sonra da 1 metre olana kadarki aldigi yolu hesapla

        do {
            toplamYol += yukseklik;    //ilk birakildigi meafe toplam yola eklendi   //inerkenki mesafe
            ziplamaSayisi++;
            yukseklik *= 0.75;
            toplamYol+=yukseklik;   //cikarkenki mesafe
            //yukseklik 1 den buyuk oldugu surece aksiyon devam eder
            //1 den asagi duserse do body si kirilacak ve while gecer
        } while (yukseklik >=1);   //condition
        System.out.println("Topunuzun ziplama sayisi: "+ziplamaSayisi);
        System.out.println("Topunuzun toplam aldigi yol: "+toplamYol);
    }

}

