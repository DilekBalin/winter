package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        /*

        kullanicidan yasini isteyin
        Kullanici yas olarak negatif bir sayi,0 veya 120 den buyuik bir sayi girerse
        illegalArgumnetException olusacak sekilde bir program yaziniz
         */
   Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz ");
        int yas=scan.nextInt();
      if(yas<=0 ||yas>120){
            System.out.println("Lutfen geceri bir yas giriniz");
            //Java bizim istedigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();
            //Biz kodun calismasini durdurmak istiyorsak throw yazdiririz ki bu da cok ciddi bir uyaridir kullanici icin
          //eger kodun calismasinin devamini istiyorsak try catch yapariz


        }else System.out.println("Uygun yas girdiniz,tesekkurler");
    }
}
