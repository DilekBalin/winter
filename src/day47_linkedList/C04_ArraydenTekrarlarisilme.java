package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlarisilme {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden elementleri silip
        // unique elementler olusan bir array haline donduren bir method olusturun

        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arr = benzersizYap(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet=new TreeSet<>();//siralamsini istedigimiz icin tree yaptik
        for (Integer each: arr
        ) {
            benzersizSet.add(each);  //bu yapimiz su anda set ama soruda array haline getirin diyor,biz dde bu set'i array'e cevirmeliyiz
        }
        System.out.println(benzersizSet);

        // Set'de index yapisi yoktur, dolayisiyla forLoop kullanamayiz
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index=0;  //arrayde de elementi yerlestirmek icn index'e ihtiyacim var
        for (Integer each: benzersizSet
        ) {
            arrBenzersiz[index]=each;
            index++;
        }
        return arrBenzersiz;
    }}