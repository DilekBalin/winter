package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; //deger ataması yapmadıgımız halde java kabul etti
       // System.out.println(Arrays.toString(arr)); //kabul etti ancak kullanmamıza izin vermez cunku deger atamadık


        //arr={1,2,3};
       // System.out.println(Arrays.toString(arr)); yine olmadı cunku uzunluk belli degil

        arr =new int[6];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);//6
        //String'teki length( ) parantz vardı bunda yok

        //arry'deki herbir elemanı index degeri kadar artıralım

        for(int i=0; i<arr.length; i++){
            arr[i]+=i; //artırmak dedigimiz icin bu daha mantıklı
            //0.indextekine 0,1.indextekine 1,2.indextekine 2...eklesin
        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5] //loopun icinde yazarsanız herbirini teker tekr yapar

        //son indexteki elementi yazdıralım
        System.out.println(arr[arr.length - 1]); //5
    }
}
