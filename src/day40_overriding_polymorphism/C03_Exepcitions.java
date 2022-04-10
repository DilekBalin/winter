package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip bolun
        //Sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);

        int kontrol=0;
        while(kontrol!=2){
            System.out.println("Bolmek istediginiz sayiyi giriniz");
            int sayi1=scan.nextInt();  //5

            System.out.println("Kaca bolmek istediginiz yaziniz");
            int  sayi2=scan.nextInt(); //0


            try {
                System.out.println("sonuc = "+sayi1/sayi2);
            } catch (ArithmeticException e) {
               // e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }


            System.out.println("devam etmek icin = 1\n bitirmek icin = 2'ye basiniz");
            kontrol=scan.nextInt();


                //java.lang.ArithmeticException: / by zero
                //	at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:23)
                //hatayi soyledi ve calismaya devam etti

;

        }


        /*
        sayi2 0 oldugunda sayi1/0 tanimsiz olacagindan
        Java bu durumla karsilasinca exception verir.
        Java'nin yazdigi mesajda exception'un ne tur bir sorun oldugu
        neden kaynaklandigi ve hangi satirda olustugu yazar.

        Exception in thread "main" java.lang.ArithmeticException: // by zero  //hatanin tanimi yani 0 ile bolunemez
	     at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:18)   //kacinci satirda hata var?

	     bunu cozmek icin sayi2'yi if ile kontrol edebiliriz


	       if (sayi2 ==0){
            System.out.println("Sayi / 0 tanimsizdir");
        } else {
            System.out.println("sonuc ="+ sayi1/sayi2);
        }
	  ama bu yontem her durumda calismaz
         */


    }

}
