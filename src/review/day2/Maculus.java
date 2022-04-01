package review.day2;

import java.util.Scanner;

public class Maculus {
    public static void main(String[] args) {

        // kullanicidan 3 basamakli bir sayi alip
        // rakamlar toplamini yazdiran
        // bir program yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen uc basamakli bir sayi giriniz ");
        int sayi=scanner.nextInt();

        int rakam=0;
        int rakamlarToplami=0;


       // 375
        rakam=sayi%10;  //sayinin birler basmagi
        rakamlarToplami+=rakam; //rakamlar toplami=rakamlartoplami+rakam
        sayi/=10;//birler basmagindan kurtuldum //37


        rakam=sayi%10; //sayinin birler basmagi  //7
        rakamlarToplami+=rakam;  //12
        sayi/=10; //3

        rakam=sayi%10;
        rakamlarToplami+=rakam;

        System.out.println(rakamlarToplami);


    }
}
