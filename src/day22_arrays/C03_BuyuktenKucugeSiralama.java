package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        //Verien bir Arry'ibuyukten kucuge sıralayıp yazdıran olusturan bir method olusturun


        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};
        terstenSiralaYazdir(arr);  //method olusturduk ve parametre de arr 'dir cunku onu tersten yazdıracak


    }

    public static void terstenSiralaYazdir(int[] arr) {  //yazdıracagımız icin void kabul ettik
        //public yaptık cunku class icinde ihtiyacımız oldugunda kullanabilecegiz

        //once sıralamalıyız:
        Arrays.sort(arr); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        //0 en basa gelir sıralamadan sonra ancak biz ters cevir dedigimzde en sona atar o zaman da en son element olur
        //iki sayının yerini degistirmek icin bos kova mantıgı ile
        //ve de son elemnti kaybetmemek icin bos bir array olusturalım

        int tersArr[] = new int[arr.length]; // uzunlugu elimizdeki array ile aynı olmalı
        System.out.println(Arrays.toString(tersArr));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] //java bize default degerlerin oldugu bir array olustrudu

        //arr icindeki elementleri alıp tek tek yazıp tersArr icinde yazmam lazım
        //ya sondaki basa alırız ya da tam tersş
        //biz for loop ile bastan alalım

        for (int i = 0; i < arr.length; i++) { //i 0 dan baslasın son karaktere kadar birer artırarak yazsın
            tersArr[i] = arr[arr.length - 1 - i];//ters elementin 0.elemti normal elemnetin sonuncu elemntini alır//45
        //en sona -1 dememmizin sebebi i indexine baglı olmasını saglamk yoksa her seferinde uzunlugun son karakterini baz alır
            //boylece 0.elemnte son elemnti yazacak,1.elemnte uunluk eksi 1 yazacak,2.elemnte uzunluk -2...

        }
        System.out.println(Arrays.toString(tersArr)); //[45, 25, 9, 9, 6, 5, 4, 3, 1, 0, 0]

    }
}