package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        //verilen bir array'e yeni bir elemnt ekleyen bir method olusturun   //normal sartlarda arrye toplama cıkarma yapılmaz
        int arr[]={3,5,7};
        int eklenecekElement=4;

       arr= arrayeElemanEkle(arr,eklenecekElement);  //Bir array donsun ben de o donen arry'i yenisine atyayaım
        //eski array de degissin diye basa arr= yazdık
        arr=arrayeElemanEkle(arr,11);  //bundan sonra istedigimizi ekleyebiliriz

        System.out.println(Arrays.toString(arr)); //[3, 5, 7, 4,11]   //en son burayı yazıyoruz

    }


    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

    //ılk once bos bir konteynıra ihtiyacımız var cunku eski elemanları ona koyup sonra
        //eklenecegi de ona koyup dondureyim

        int yeniArray[]=new int[arr.length+1];  //[0, 0, 0, 0]   //bos konteynır
        //eski array 3 yenis 4 uzunlukta oldugu icin +1 dedik


         for (int i=0; i<arr.length; i++) {
            yeniArray[i] = arr[i]; //yeni array'in kacıncı indexi olursa olsun eskisinin indeksiile aynı olacak

             //burada yeni arrayin onceki elemntlerine eski elementleri ekledik
        }
        yeniArray[yeniArray.length-1]=eklenecekElement;
//burada da yeni array'in son elementine eklenecek lementi atadık

        return yeniArray;

    }

    }