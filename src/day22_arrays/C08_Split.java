package day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        //verien bir cumlede istenen harfin kac kere kullanıldıgını yazdıran bir emthod olusturun

        String cumle="Nerede o 'hello world' yazdiramayn ogrenciler?";
        String harf="e";

        
        //method yapalım:
        harfKacKereKullanilmis(cumle,harf);
        
        
    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {

        int sayac=0;  //kac kez oldugunu sayması icin

        String karakterler[]=cumle.split("");  //harflerine ayırmak icin split methodu  tek tek ayırdı
        System.out.println(Arrays.toString(karakterler));// karakterleri tek tek gorduk

        for(int i=0;i< karakterler.length;i++){
            if(karakterler[i].equals(harf)) {
                sayac++;
            }
        }
        System.out.println("Aradiginiz " + harf + " harfi, verilen cumlede " + sayac + " adet kullanilmistir");

    }
}
