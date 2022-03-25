package ODEVLER;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
       //TASK1
        // Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        // ve dikdortgenin kare olup olmadigini yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uzun kenar ve kısa kenari giriniz");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();

        if (kenar1 == kenar2) {
            System.out.println("Bu bir karedir");
        } else {
            System.out.println("Bu bir dikdortgendir");
        }


        //TASK2
        //kullanicidan bir karakter girmesini isteyiniz ve
        //girilen karakterin harf olup olmadıgını yaziniz



        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);
        if (karakter>='A'&& karakter<='Z' || karakter>='a'&& karakter<='z'){
            System.out.println("Girdiginiz karakter harftir");
        }else{
            System.out.println("Girdiginiz karakter harf degildir");
        }


        //TASK 3
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        //eger 3 kenar uzunlugu birbirine esitse ekrana "Eskenar Ucgen "yazdirin
        //diger durumlarda ekrana "Eskenar degil" yazdirin.

        System.out.println("lutfen bir ucgenin 3 tane kenar uzunlugu yaziniz");
        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3= scan.nextInt();



        if (k1!=k2 && kenar2!=k3){
            System.out.println("Bu bir eskenar degildir");
         } else {

            System.out.println("Bu bir eskenardir");
    }



    }
    }
