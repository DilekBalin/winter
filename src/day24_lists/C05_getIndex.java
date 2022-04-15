package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {

        //bir listede kim kacıncı sırada onu ogeniriz
        List<Integer> sayilarList=new ArrayList<>();
        sayilarList.add(5);//[5]
        sayilarList.add(3); //[5, 3]
        sayilarList.add(0,7); //[7, 5, 3]
        sayilarList.add(2,7);  //[7, 5, 7, 3]


        System.out.println(sayilarList.get(2)); //7  //get 'in icine index yazıyoruz ve index dondurur >>2.index'te kim var?
        System.out.println(sayilarList); //[7, 5, 7, 3]   //liste degismedi yani sasdece indexin yerini gosterdi
        // ve getirdi o elementi sokup alamdi

    }
}
