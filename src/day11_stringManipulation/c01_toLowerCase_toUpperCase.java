package day11_stringManipulation;

import java.util.Locale;

public class c01_toLowerCase_toUpperCase {

    public static void main(String[] args) {


        String str="Java Guzeldir";

        //Biz string method'larını arka arkaya kullanabiliriz//string olarak kaldıgı muddetce
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        //str.charAt(5) ;//Boyle yazdigimizda sonuc String olmaktan cıkıyor artık sonucu char olur
        //Dolayısıyla String'te yapmak iztedigimiz tum degisiklikleri once yapıp
        //sonra charAt() method'unu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); // JAVA GUZELDİR

    }
}
