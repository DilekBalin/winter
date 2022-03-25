package day07_IfElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner ( System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi=scan.nextInt();

        if (sayi %2==0) {
            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi %2!=0){
            System.out.println("girilen sayi tek");

        }



        }
    }




