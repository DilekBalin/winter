package groupWork.Arrays;

import java.util.Arrays;

public class S6 {
    public static void main(String[] args) {

       //  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.

        String str="Java ne zaman kolay olacak";
        str=str.replaceAll("\\s","");
        System.out.println(str); //Javanezamankolayolacak

        String karakterler[]=str.split("");
        System.out.println(Arrays.toString(karakterler));

        int karakterSayisi=0;
        for (int i=0; i<karakterler.length; i++){
            karakterSayisi++;


        }
        System.out.println(karakterSayisi);
        }
    }
