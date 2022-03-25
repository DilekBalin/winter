package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr [][]= {{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7    //ilk koseli parantez icindeki 2.ındex
        System.out.println(arr[1][1]);//10   //ikinci koseli parantez icindeki 1.index

        //ilk inner arry 'in tum elementlerini yazdırın
        System.out.println(arr[0]); //[I@2acf57e3 //arr[0] bir array oldugunan direkt yazdırılamaz ,toString kullanılmalı
        System.out.println(Arrays.toString(arr[0]));// //[3, 1, 7] Arrays toString ile yazdırdı


        //Array'de tum elementleri bir array olarak yazdırmakistersek:
        System.out.println(Arrays.toString(arr)); //[[I@2acf57e3, [I@506e6d5e]   bunu verdi yani iki aray'in referanslarını

        //Multi dimensional aray de tum elementleri Arrays.deepToString ile yapıyoruz
        System.out.println(Arrays.deepToString(arr)); //[[3, 1, 7], [6, 10, 2]]
    }
}