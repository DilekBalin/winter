package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {

    //non primitive data turlerinde objenin kendisi degil de
    //icindeki elementler degisirse Java objenin referansi ve objenin kendisi degismedigi icin
    //element degisikliklerini kabul eder ve kalici yapar

    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));  //[1, 2, 3]
        arrDegistir(arr);
        System.out.println("method call sonrasi: "+Arrays.toString(arr));//[5, 6, 3]
    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;  //yeni bir obje yapmadik sadece objenin degerini degistirdik
        arr[1]=6;
        System.out.println(Arrays.toString(arr)); //[5, 6, 3]
        // biz burada arry'in kendisini degistirmedik icindeki elementleri degistridik
        //aslinda referans da array de aynidir sadece elementelrin degeri farkli oldu
    }
}
