package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("H", 3);
        myMap.putIfAbsent("K", 5);
        //bir ekleme yapmak istedigimizde Key daha once eklenmmemisse Map'e eklesin
        //daha onceden eklenmisse, eskiyi silmememk icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A", 6));//null
        System.out.println(myMap.putIfAbsent("K", 20));//5 eski deegeri getirdi
        System.out.println(myMap); //{A=6, H=3, K=5}

        if (myMap.putIfAbsent("K", 20) != null) {
            System.out.println("Girdiginiz key Map'te zaten var");

        }
        System.out.println(myMap);//{A=6, H=3, K=5}
        myMap.put("A",10);
        System.out.println(myMap); //{A=10, H=3, K=5}
        myMap.computeIfAbsent("A",v->20 );
        System.out.println(myMap);//{A=10, H=3, K=5} A degismedi cunku A var

        myMap.compute("A",(key,value) -> 20);
        System.out.println(myMap);//{A=20, H=3, K=5}

        // H'nin degerini 2 katinin 5 fazlasi yapalim
        myMap.compute("H",(key,value) ->(2*value+5));
        System.out.println(myMap); //{A=20, H=11, K=5}


    }
}