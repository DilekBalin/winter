package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        //Verilen bir array'i buyukten kucuge siralayip bize donduren bir emthod olusturun

        //bir methodu ters cevirip kaydetmek istiyorsak geri dondurup kaydetmek lazım

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        arr = terstenSirala(arr);  //arr elementlerini tersetn sıralayıp arr 'ye atayacak
        System.out.println(Arrays.toString(arr));   //boyle aratırsak konsola koseli pazarntez icinde yzdırırır
        //ama for loop la yaptıgımızda elemanları yazdırıır ve koseli parantez kullanmaz
        System.out.println("En buyuk element:"+arr[0]);

    }

    public static int[] terstenSirala(int[] arr) {


        Arrays.sort(arr);    //once array'yi sıraladık
        int tersArr[] =new int[arr.length]; //sonra ayn uzunlukta yenş bir array olusturduk //bos kova
        for(int i=0; i<arr.length; i++){   //tamamını bos array'e tasıdık
            tersArr[i]= arr[arr.length-1-i];
        }
          return tersArr;
    }


}