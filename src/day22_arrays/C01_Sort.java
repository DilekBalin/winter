package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {
        //

        String arr []={"S","M","A","T"}; //alfabetik sıralama yapmaz , nasıl girdiysek o sekilde tutar
        System.out.println(Arrays.toString(arr));//[S, M, A, T]

        Arrays.sort(arr); //sıralama ypmak istedigimizde sort methodu kullanrız ve sortun icine variable yazarız
        System.out.println(Arrays.toString(arr));//[A, M, S, T]

        //Java da bu sıralamaya Natural Order denir
        //Sayı olursa kucukten buyuge metin olursa alfabetik sıralamaya gore

    }
}
