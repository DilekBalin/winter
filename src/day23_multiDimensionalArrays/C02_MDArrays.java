package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {
    public static void main(String[] args) {

        //Verilen multi dimensional array'in tum elementlerinin toplamnın bulunuz
        int arr[][] = {{3, 1,7}, {6, 10, 2}};
        int toplam = 0;  //tolamı koymak icin bir konteynır yaaptık

        //arr[0][1] //ulasabailecegimiz her elementin ayrı ayrı koseli parantezi olur

        for (int i = 0; i < arr.length; i++) {  //0.indexten baslasın ve outer'un uzunlugu kadar gitsin
            for (int j = 0; j < arr[i].length; j++) {   //i'nin uzunlugu kadar gidecek boylece 0.indextekini alırsan onun uzunlugu kadar gidecek...
                toplam+=arr[i][j];  //yukarıda tanımladıgımız toplama arr[i][j]'yi ekledik

            }
        }
        System.out.println("Array'lerin toplamı:" +toplam );

        //Ozet:
        //i 0'dan basladı ve arr.length uzunlugu 2 yani dıs arr uzunlugu 2,  2 ye kadar gidecek
        //j de 0 dan basladı arr[i] nini uzunlugu 3 ,3 uzunluk kadar gidecek
        //ilk seferde arr[0][0] yani 0.indexteki 0.element =3    toplam 3
        //ic body de j 1 artacak ve basa doncek j 1 iken i hala 0, arr[0][1]=1   toplam 4
        //ic body j 2 oldu ve basa dondu i hala 0 ,   arr[0][2]=7   toplam 11
        //inner loop 0'dan 3 ' kadar calıstıgı icin basa donecegiz
        // i artık 1 olacak  arr[1][0] =6   toplam 17
        //arr[1][1]=10   toplam 27
        //arr[1][2]=2    toplam 29
        //once dıs body ile isleme basladık ve ic body' geldigimizde onu bitirip tekrar 2.dıs body' e donduk

    }
}