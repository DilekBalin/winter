package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListdenIstenmeyenElementiSilme {
    public static void main(String[] args) {

        //Verilen bir array'den istenen elementi silip
        // kalanları yeni bir array olarak yazdıran bir method olusturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 2;

        //List ile yapınca uzunlugunu ve yerlestircegim elemanın indexini de kontrol etmek zorunda degilim

        istenmeyenElementiSilveYazdir(arr, istenmeyenEleman);
    }

    public static void istenmeyenElementiSilveYazdir(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {  //array'in tum elementlerini gozden gecirelim
            if (arr[i] != istenmeyenEleman) { //i esit degilse istenmeyenElema'a
                yeniList.add(arr[i]); //yeni listeme i yi ekle
            }
        }
        System.out.println(yeniList);   //[4, 2, 5, 7, 8, 5, 2, 4]
    }
}