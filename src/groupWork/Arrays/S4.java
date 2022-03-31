package groupWork.Arrays;

import java.util.Arrays;

public class S4 {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         ** Array olan bir "HeySiri" dizginiz var, onu "ByeSiri" olarak değiştirin ve değişen array yazın
         */

        String str="HeySiri";
        str=str.replace("Hey","Bye");

        String arr[]=new String[1];  // yeni bir string array olusturdum ve bu array'in uzunlugu 1 olan bir elementi var
        arr[0]=str;   //arr'nin 0.karakteri yani "HeySiri" str'ye yani "ByeSiri"ye esittir
         System.out.println(Arrays.toString(arr));

    }
}
