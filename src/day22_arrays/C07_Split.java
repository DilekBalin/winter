package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {


        String str="Java gun gectikce guzellesiyor";
        //str.split(" ");    //spaceden itibaren boler ve yerine virgul koyar boylece 4 elementli bir array olusur
        String kelimeler []= str.split(" ");

        System.out.println(Arrays.toString(kelimeler));  //[Java, gun, gectikce, guzellesiyor]  bosluk ve virgulleri java koydu
        System.out.println(kelimeler[1]); //gun

        String gectikce[] = str.split(" gectikce");
        System.out.println(Arrays.toString(gectikce));    //[Java gun,  guzellesiyor]

        String harfler [] = str.split("");
        System.out.println(Arrays.toString(harfler));  //[J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]
        //arka arkaya gelen harflerin arasını hiclik kaabul edip virgul koydu ve bosluklar icin de harften sonra virgul
        // ve 2 bosluk yine virgul ve harf diye devam etti


    }
}
