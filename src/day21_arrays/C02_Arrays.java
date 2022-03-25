package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","Veli","Ayse"};

        //array icindeki elementlere ulasabilmek icin index kullanırıız
        System.out.println(arr1[0]); //arr 1 arry'ne gidecek ve 0.elemtteki arrayi yazdıracak yani ali'
        arr1[1]="Esila";// Ali!nin yerine Esila yazdıracak
        System.out.println(arr1[1]);//Esila

        //arry'nin icindeki indexi kullananrk elementlere ulasabilir ve update edebiliriz
        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
       // System.out.println(arr2[5]);//  //hata verir

        //Arry'nin tamamını yazdrımak istersek:
        System.out.println(arr2); //[I@2acf57e3 yazdırdı yani array'in referansı java onun stack teki adını buldu
        //Arrays non-primitive olduklarından direkt yazdrımak istersek java,referans bilgisi yazdırır


        for (int i = 0;i<4;i++){
            System.out.print(arr2[i]+" "); // 0 0 0 0


        }
        System.out.println("");

        //Arry yazdırmak icin javadaki arrays class'ından toString methodu kullanırız
        System.out.println(Arrays.toString(arr2));  //[0, 0, 0, 0]  //Arrays Classından hazır bir methodla yapabildik

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); // [0, 11, 0, 22]
        System.out.println(Arrays.toString(arr1));  //[Ali, Esila, Ayse]
        //String yerine baska bir data turu atayamayız cunku en basta String demisiz:
        //public static void main(String[] args) {



    }
}


