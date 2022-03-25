package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        //Verilen bir array'den istenen elementi (kac tane varsa) silip
        // kalanları yeni bir array olarak yazdıran bir method olusturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 3;

        istenmeyenElementiSil(arr, istenmeyenEleman);

    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        //1.adım:istenmeyen element say
        //2.Yeni array olustur
        //3.Eski array'den uygun elementleri yeniye tası
        //4.yazdır


        //1-istenmeyen eleman sayısını bulalım
        int sayac = 0;   //array'in tum elementlerinii gozden gecirelim, 3'e esit olan varsa sayıyı 1 artıralım

        for (int i = 0; i < arr.length; i++) { //saymaya 0.indexten baslasın verilen elementlerin hepsini dolasması icin
            // tum uzunluga kadar gitsin
            if (arr[i] == istenmeyenEleman) {  //sayacımız istenmeyenElemana esit olanı bulursa yazdırıp
                //1 artırarak saymaya devam edecek
                sayac++;

                //Bu loop bittiginde bastan sona tum elementleri gozden gecirecek ve
                //istenmeyen elementleri sayacak
            }
        }
        //2-for loop bittiginde yeni array'i olusturalım
        int arrYeni[] = new int[arr.length - sayac]; //yeni array'imiz eskisinin uzunlugundan sayacı cıkarark bulunur
        //uzunlukları esit olsun ki eskileri yeniye tasıyabilelim

        //3-eski array'den uygun elementleri yeniye tası
        //yine bir for loop lazım cunku tum elementleri gozden gecirecegim

        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyenEleman) {// sayarken istenmeyen elemana esit olmayanlari alacak ancak sıra kayacagı icin
                // en basta int index olustrumam lazım
                arrYeni[index]=arr[i]; //indexi kullandıgım icin 1 artıracagım
                index++;
            }
        }

        //4_Listeyi yazdıralım
        System.out.println(Arrays.toString(arrYeni));
    }
}