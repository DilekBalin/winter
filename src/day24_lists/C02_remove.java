package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, Oguzhan]


        /* isimler.remove("Oguzhan");  //direkt objeyi yazarsak true ya da false doner
        Bu sonucu kullanmak istiyorsak bunu boolean bir objeye atamalıyız
        kullanıcıya yazdırmak istiyorsak da if ile sonucu belirtmeliyiz*/


        //remove(istenenObject)methodu istenen elementi kaldırıp bize true/false doner
        //eger remove isleminin yapıldıgını kontrol etmek istiyorsanız
        //method'u boolean bir variable'a atayabilirsiniz

        boolean sonuc = isimler.remove("Oguzhan");
        sonuc = isimler.remove("Berk");

        //sonucu kullanıcıya yazdırmak siterseniz
        //if else ile istediginiz degerlendirmeyi yazdırabilirsiniz
        if (sonuc == true) {
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigi icin silinemedi");
        }

        System.out.println(isimler); //[Aykut, Yusuf, Ilker]

        //remove icin obje yazdıgımızda silip silmeyecegi belli olmaz cunku listede var mı yok mu bilmiyoruz
       //remove (index)yazdıgımızda sildim/silmedim ihtimali kalmaz cunku listede o indexte birelemet mutlaka vardır
       //bize remove edilen elementi doner
        System.out.println(isimler.remove(1));//Yusuf'u siler ve
                                                   //delil olarak Yusuf isminibize dondurur

        isimler.remove(1);
        //bunu yazdırmak zounda degiliz
        //yazdirsak da yazdırmasak da liste degistive 1.index'teki element silindi

        System.out.println(isimler); //[Aykut, Ilker]
    }

}











