package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        int harfSayisi=kelime.length();


        if (harfSayisi<3){
            System.out.println("kelime cok kisa");// 3 harften azsa burası calısacak

        }else if(harfSayisi==3){   //3,4 ve 5 harfli bir kelime ise burası calısacak
            ucHarfiTersineCevir(kelime);
        }else if (harfSayisi==4){
            dortHarfiTersineCevir(kelime);
        }else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);


        }else{//burası ilk if'in else'i cunku 5'ten  buyukse burası calısacak
            System.out.println("kelime cok uzun");
        }







    }  //Burası Class'ın bittigi yer degil ancak method'larımız burda sona erer.

    private static void ucHarfiTersineCevir(String kelime) { // 3 harfli oldugunu biliyorum cunku harf sayısını if'le kontrol etmistik
        //bundan sonra kelimeyi tersine cevirmemiz gerekiyor
        //bunu da onceki klasorden alabiliriz
        //ancak tersKelime yapmak icin basa String tersKelime demeliyiz
        //aynı islemleri diger ikisi icin de yapalım

       String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }


    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }



   private static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

       System.out.println("girdiginiz kelimedeki harf sayisi : 5");
       System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }


    // Method create etmek icin
    //1.Adım:
    // Methodlarımıza isim verdik ve sonuna da parantez actık  //besHarfiTersineCevir()
    //cunku parantez demek bu islem ya method'tur ya da method olacak


    //2.adım
    //method'a gideriz ve parantez icine bir parametre  yazarız //bizimki:  kelime
    //Methodzumuza yaklasıp create method kısmını tıklarız(mavi renk)



    //class'ın calısması icin method'u cagırmamız gerek
    //robota evi supur dersin calısır yoksa orada oylece durur
    //bundan sonra burdaki methodlardan birine ihtiyacımız olursa her seferinde kullanabiliriz
    //method create etmek kodun hem daha anlasılır olması ve cok kullanılan bir methodu tekrar tekrar kullanmaktan kurtulmak



}
