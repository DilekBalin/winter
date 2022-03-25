package ebruMeryemFikriyeDilekSoru;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yaziniz
        //Eğer sıfırdan büyük ya da eşitse :
        //Sayı olduğu gibi yazılır.
          //  Eğer 0'dan küçük ise :
            //  Sayının negatif olduğunu biliyoruz. Sayıyı pozitif yapmak için sayı “-1” ile çarpılır.
        // Çarpım sonucundaki çıkan sayı konsola yazdırılır.
               // Program kapanır.


        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi yaziniz");
        int sayi= scan.nextInt();
        System.out.println(sayi>=1 ? sayi: sayi*-1);











    }
}
