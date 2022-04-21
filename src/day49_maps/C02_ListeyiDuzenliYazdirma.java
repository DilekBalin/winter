package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        Map<Integer, String> sinif = MapOlustur.myMap(); //MapOlutur class'indan myMap() gelecek
        //ve bu gelen Map' bir yere koymamiz gerekiyor bu yuzden   Map<Integer,String> sinif   buraya atadik

        //Aslinda olusturdugumuz method'u, sinif Map'ine atadik
        System.out.println(sinif);

        sinifListYazdir(sinif);
    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("======================");

        //Map yapisindan yazdridigimizda kullanicilar bir sey anlayamayabilir
        //Bunun icin once Map yapisini kodlarla manipule edip
        // Map'teki datalari istedigimiz formata sokmazmiz gerekir
        //1.adim: key ve value'lari Map'ten alip iki farkli collection uyesine atadik
        Set<Integer> keySet = sinif.keySet();   //key'leri tek tek getirsin diye Set yaptik
        // zaten sinif.key dediginde  ne getirecegini soyluyor
        Collection<String> valueSet = sinif.values(); //

        System.out.println(keySet); //[101, 102, 103]
        System.out.println(valueSet); //[Ali,Can,Dev, Veli,Yan,QA, Ali, Yan,C++]
        System.out.println(valueSet.size()); //3 >>> cunku her key'in bir adet string uyesi vardi(icindekiler onemli degil)
        for (String each: valueSet
             ) {
            System.out.println(each);
        }


    }
}