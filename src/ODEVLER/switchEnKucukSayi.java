package ODEVLER;

import java.util.Scanner;

public class switchEnKucukSayi {
    public static void main(String[] args) {
        // soru2:Kullanicidan bir sayi girmesini isteyiniz
        //girieln sayi
        // 10 ise "İki basamaklı en kucuk sayi"
        //100 ise "Uc basamakli en kucuk sayi"
        //1000 ise "dort basamakli en kucuk sayi"
        //dşger durumlarda "girdigin sayiyi degistir" yazdirin

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi =scan.nextInt();

        switch (sayi) {
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Lutfen girdiginiz sayiyi degistirin");






        }

    }
}
