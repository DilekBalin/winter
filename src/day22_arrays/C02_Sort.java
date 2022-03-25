package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        //Verilen bir array de en kucuk ve en buyuk degerleri yazıdırn

        int arr []={3,5,6,1,9,0,45,25,4,9,0};


        //sort methodu olmadan
        //for loop ile tek tek tum elemanları almamaız lazım

        int enKucukSayi=Integer.MAX_VALUE; //arr[0]; //ne yazarsam yazayım burdaki elementler burdan kucuk olur
        int enBuyukSayi= Integer.MIN_VALUE; //arr[0]; // ne yazarsam yazayım arr icindeki elementler burdan buyuk olur


        for (int i=0; i<arr.length; i++) {  //0 dan baslasın variablenın uzunluguna kadar gitsin

            if (arr[i]<enKucukSayi){  //arry'in i. elemntteki indeksi enKucukSayi variablından kucukse
                enKucukSayi=arr[i];  //enKucukSayi variable'ı i 'dir yani i. elementtir

                 //bu karsilastırmayı yapmak icin ornegin    int enKucukSayi=10     olsun
                //once 3 'u alır 10 ile karsılastırır 3 daha kucuk oldugu icin onu yazdırır
                //sonra 5 i alır 5 ile 3 u karsılastırır 3 en kucuk 3 u yazdırır
                //6 yı alır 6 ile 3 u karsılastırır 3 u yazdırrır
                //1 i alır  1 ile 3 u  karsılastırır 1  en kucuk ve 1 i yazdırır
                //....bu sekilde hepsini tek tek karsılastırır ve en kucugu yazdırır

                //Bunun yerine int enKucukSayi=MAX_VALUE; yaparsak yani bu sayı en buyuk oldugu icin
                // arry'ın icine ne atarsak atalım hep bundan kucuk olacak

            }


            if(arr[i]>enBuyukSayi){ //i.element enBuyukSayi'dan buyukse
           enBuyukSayi=arr[i];  //en buyuk sayımız i.elemnttekidir

       }
        }

        System.out.println("Array'daki en kucuk sayi:"+enKucukSayi);
        System.out.println("Array'daki en buyuk sayi:"+enBuyukSayi);


        //bu kadar uzun yapma yerine sortla yapsaydık:
        Arrays.sort(arr);
        System.out.println("Array'daki en kucuk sayi:"+arr[0]);  //arrr[0]>>en kucuk en basta demek
        System.out.println("Array'daki en buyuk sayi:"+arr[arr.length-1]);//arr[arr.length-1]) >>> en buyuk en sonda dmek
        // sadece 3 satır kullandık






    }
}
