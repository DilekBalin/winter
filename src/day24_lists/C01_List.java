package day24_lists;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {





        int arr[]={};
        //bu array'e  5 ekleyelim

        arr= C06_Arrays.arrayeElemanEkle(arr,5);  //basın arr yazdım ki kalıcı olarak degissin
        System.out.println(Arrays.toString(arr)); // [5]

        //bir de 3 ekleyelim
        arr=C06_Arrays.arrayeElemanEkle(arr,3);//[5,3]

//bir list olusturalım
        List<Integer> sayilarList=new ArrayList<>();   //int dersek kabul etmez
        System.out.println(sayilarList);   //[]
        sayilarList.add(5);  //[5]   // istersek index yazıyoduk istersek de direkt ekleriz bos bieyin indexi olmaz
        //// o yuzden direkt eklemek istedigimizi yazdık
        sayilarList.add (3);// [5, 3]
        sayilarList.add(0,7); //0.indexe 7 ekle // [7, 5, 3]
        sayilarList.add(2,7);//
        System.out.println(sayilarList); // [7, 5, 7, 3] //
        }
}
