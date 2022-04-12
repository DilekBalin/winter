package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    //Kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
    //toplam 500'u gecerse programi bitirsin veya
    // Kullanici bitirmek istediginde Q'ya bassin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \n bitirmek icin Q'ya basiniz ");
            int sayi= 0;



            try {
                sayi = scan.nextInt();
                toplam+=sayi;
            } catch (InputMismatchException e) { //bir seye yanlis basildi demektir
                //ama o basilan sey Q mu baska bir sey mi nasil kontrol edecegiz?
                String hataliGiris=scan.next();
                if(hataliGiris.equalsIgnoreCase("q") ){

                    break;

                }else{
                    System.out.println("hatli giris");
                }

            }




        } while (toplam < 500);
        System.out.println("Girdiginiz sayilarin toplami = "+toplam);
    }
}
