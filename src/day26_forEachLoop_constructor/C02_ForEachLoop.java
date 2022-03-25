package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        //10 elementli bir list olusturalım


        int arr[]={2,5,4,6,4,9,7,1,3,10};
        List<Integer> sayilar=new ArrayList<>();

    for(int each:arr){  //bana array'deki elementleri getir ben de onları sayılar listeme ekleyeyim
        sayilar.add(each);
    }
        System.out.println(sayilar);   //[2, 5, 4, 6, 4, 9, 7, 1, 3, 10]

        //sayilar listesinde 3'e bolunemeyen sayılatı for each loop ile yazdıralım

        for (int each: sayilar){

            if (each %3!=0){
                System.out.print(each +" ");
            }
        }


    }
}
