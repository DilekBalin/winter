package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};
        int istenenSayi=3;


        //eger javada hazır binarySearch ile yapmak isterseniz
        //once sort methodunu kullanıp sonra binarysearch yapmalıyız
        //binarySearch() bize istenen sayının oldugu indexi verir



        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr,istenenSayi));//  //array ve aranan kelime parantez icine yazılır
        //3 icin 2 yi verdi cunku bize verilen 3.sayının indexidir


        //eger olmayan bir elementi aratırsak:
        //java bulamadıgını gostermek icin - isareti koyar
        //sonra o sayı olsaydı sıralaması ne ise o sırayı bize verir
    }
}
