package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        //verien bir array de istene bir elementin var olup olmadıgını
        //true /false yazdırarak gosteren bir method olusturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=14;
        //int istenenSayi=14; //olmayan bir sayı verirsek hicbir sey yazdırmak cunku bu durumu handle etmedik
        //bunu yapmak icin ise booelan sonuc=false; deriz ve ifin icine sonuc=true yazdırırız

        istenenelemanVarMi(arr,istenenSayi); //method olustruduk ve arguman olarak iki yeri yazdık




    }

    public static void istenenelemanVarMi(int[] arr, int istenenSayi) {

       boolean sonuc=false;

        for (int i=0; i<arr.length; i++) { //0 dan baslasın ve uzunluk kadar gitsin


            if (arr[i]==istenenSayi) {
                sonuc=true;
                break;
            }

        }
        System.out.println(sonuc);
    }
}
