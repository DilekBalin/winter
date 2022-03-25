package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru11 {
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
        System.out.println("lutfen bir harf giriniz");
        String harf = scan.next().toLowerCase();
        String sesliHarfler = "aeiou";
        if (!(harf.charAt(0) >= 'a' && harf.charAt(0) <= 'z') || (harf.charAt(0) >= 'A' && harf.charAt(0) < 'Z')) {
            System.out.println("lutfen harf giriniz");
        } else {
            for (int i = 0; i < sesliHarfler.length(); i++) {
                if (harf.length() > 1) {
                    System.out.println("girdiniz harften uzun bir karakter oldu");
                    break;
                } else if (sesliHarfler.contains(harf)) {
                    System.out.println("sesli harftir");
                    break;
                } else {
                    System.out.println("sessiz harf");
                    break;
                }
            }
        }
    }
}