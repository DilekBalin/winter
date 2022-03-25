package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  isminizi giriniz");
        String isim = scan.nextLine();


        System.out.println("Lutfen soy  isminizi giriniz");
        String soyIsim = scan.nextLine();
        if (isim.length() > soyIsim.length()) {
            System.out.println("isim soy isimden uzundur");
        } else if (isim.length() < soyIsim.length()){
        System.out.println("Soy isim isimden uzundur");
    }else{
            System.out.println("uzunluklar esit");
        }








    }
}
