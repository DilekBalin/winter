package ODEVLER;

import java.util.Scanner;

public class NestedIfElseIlkHarf {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyiniz
        //Eger ilk harf buyukse A olup olmadıgını kontrol ediniz
        //İlk Harf A ise "Gecerli Sifre"
        //degilse "Gecersiz Sifre" yazdirin

        //Eger ilk harf kucuk harf ise z olup olmadıgını kontrol edin
        //İlk harf z ise "Gecerli Sifre"
        //degilse "Gecersiz Sifre" yazinizi

        Scanner scan=new Scanner (System.in);

        System.out.println("Lutfen sifrenizi giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='A' && krk<='Z'){

            if (krk=='A'){
                System.out.println("Gecerli Sifre");
            }else {
                System.out.println("Gecersiz Sifre");
            }


        }else if(krk>='a' && krk<='z'){
            if (krk=='z'){
                System.out.println("Gecerli Sifre");
            }else {
                System.out.println("Gecersiz Sifre");
            }


        }else {
            System.out.println("lutfen harf giriniz");
        }



    }
}