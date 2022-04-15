package day24_lists;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {
        //Eger alt elemanlarla ındexlerle calısıyorsak array kullanmak daha mantıklı olur.
        //List olusturmnain negatif tarafi
        //Array list length'i esnke olan bir array'dir

        int arr[] = {};
        //bu array'e  5 ekleyelim

        arr = C06_Arrays.arrayeElemanEkle(arr, 5);  //basına arr yazdım ki kalıcı olarak degissin
        //Static methodlarin amaclarinan biri:Class ismi yazarsak methodlari getirir
        System.out.println(Arrays.toString(arr)); // [5]


        //bir de 3 ekleyelim
        arr = C06_Arrays.arrayeElemanEkle(arr, 3);//[5,3]

        //bir list olusturalım
        List<Integer> sayilarList = new ArrayList<>();   //int dersek kabul etmez cunku List,primitive kabul etmiyor
        System.out.println(sayilarList);   //[] //Array gibi toString dememize gerek yok
        sayilarList.add(5);  //[5]   // istersek index yazıyoduk istersek de direkt ekleriz bos bieyin indexi olmaz
        //// o yuzden direkt eklemek istedigimizi yazdık
        sayilarList.add(3);// [5, 3]
        sayilarList.add(0, 7); //0.indexe 7 ekle // [7, 5, 3]
        sayilarList.add(2, 7);//
        System.out.println(sayilarList); // [7, 5, 7, 3] //

        //List esnek oldugu icin cok kullanilir bu yuzden listte de bircok method vardir

        //List'i 0'dan olusturur elemanlari teker teker eklemek zorundayiz
        List<String> hayvan = new ArrayList<>();
        //add() methodu index ile de index  olmadan dacalisabilir
        hayvan.add("kedi");
        hayvan.add("yilan");
        hayvan.add(1, "kartal");
        System.out.println(hayvan);//[kedi, kartal, yilan]

        hayvan.add(0, "sinek");
        hayvan.add(1, "aslan");
        System.out.println(hayvan); //[sinek, aslan, kedi, kartal, yilan]
        System.out.println(hayvan.size()); //5 array'de length ama parantezsiz Listde de size uzunluk verir
        System.out.println(hayvan.isEmpty());//false
        System.out.println(hayvan.remove(2));  //kedi  >>>>>istersem indexi silerim
        //index yazdigimizda o obje kesinlikle vardir ve bize remove edilen elementi doner
        System.out.println(hayvan);//[sinek, aslan, kartal, yilan]
        System.out.println(hayvan.remove("sinek"));//true >>>> istersem de objeyi silerim ve o obje varsa bize true yoksa false doner
        //Ancak bu objenin silinip silinmeyecegi belli degil cunku listede olmayabilir
        System.out.println(hayvan);//[sinek, aslan, kartal, yilan]


    }
}
