package groupWork.Interwievquestion1;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

    /*
      /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str= scanner.nextLine();

        System.out.println("Bir sayi giriniz");
        int sayi=scanner.nextInt();

        System.out.println(ilkSonHarf(str,sayi));

    }

    private static String ilkSonHarf(String str, int sayi) {
        String is=str.substring(0,1)+str.substring(str.length()-1);

        String a="";
        for (int i=0;i<sayi;i++){
            a+=is;
        }
       return a;
    }
}
