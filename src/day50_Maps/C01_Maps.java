package day50_Maps;

import day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {
        //Sinifatki ogrenci listesini duzenli olarak yazdiralim

       Map<Integer,String> sinifList =MapOlustur.myMap();
        System.out.println(sinifList);

        /*
        eger key'lere tek tek ulasmak istersek index yapisina ihtiyacimiz var
        ancak Map index yapisini desteklemez
        bunun iicin key'leri once bir Set'e
        sonra da Set'in tum elementlerini bir List'e ekledik
        */

        Set<Integer> sinifKeySeti=sinifList.keySet();
        List<Integer> keyList=new ArrayList<>();
        keyList.addAll(sinifKeySeti);
        System.out.println(keyList);
        System.out.println(keyList.get(1));//102

    }
}
