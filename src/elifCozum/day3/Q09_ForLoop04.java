package elifCozum.day3;

import java.util.Scanner;

public class Q09_ForLoop04 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String harf = scan.nextLine();
        String sesli = "aeiou";


        String sesliHarfler = "aeiou"; //inglizce karakterleri aldim sadece, karisiklik olmasin diye..
        if (!(harf.charAt(0) >= 'a' && harf.charAt(0) <= 'z' || harf.charAt(0) >= 'A' && harf.charAt(0) <= 'A')) {
            System.out.println("hatali giris");
        } else {

            for (int i = 0; i < sesliHarfler.length(); i++) {
                if (harf.length() > 1) {
                    System.out.println("birden fazla deger girdiniz");
                    break;
                } else if (sesliHarfler.contains(harf)) {  //sesli harfler girilen kelimenin ilk karakterini iceriyor mu?
                    //kullanici kelime girse bile ilk karaktere baksin..
                    System.out.println("sesli harf");
                    break;
                    //sesli harfi bulunca aramaya devam etmesin, donguyu kirsin..
                } else {
                    System.out.println("sessiz harf");
                    break;

                }
            }
        }
    }
    }