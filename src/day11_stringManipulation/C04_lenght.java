package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_lenght {
    public static void main(String[] args) {



        //Kullanicidan ismini alip bas harfini ve son harfini
        //buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk harf:"+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length()); //0 sıfır

        String str2=null;
        System.out.println(str2);
        System.out.println(str2.length()); // calistirildiginda hata verir


        //String str3=;
        // System.out.println(str3); //hata verir
        //Java deger bekliyor yukaridaki null kısmında ise
        //deger atamadım ama frakındayım diyosunuz ve java durumun kontrol altında oldugunu bilir.

    }
}
