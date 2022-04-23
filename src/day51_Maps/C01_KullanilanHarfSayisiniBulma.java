package day51_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
        /*
      Soru 1 ) Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
      Ornek : Input : Hellooo
       output : H=1, e=1, l=2, o=3

         */


        String input = "Hellooooooooo";
        String harflerArr[] = input.split("");  //string'lerden olusan bir array olusturduk ve harf harf ayirdik
        Map<String, Integer> kullanimSayilari = new HashMap<>(); // key'lerimin string,value'larimin integer oldugu bir Map olusturdum
        //harfler key olacak,kac kez kullanildi kismi value olacak cunku burasi degisken
        for (String each : harflerArr   //for each bana array'in icindeki elementleri yanistring'leri getircek,
           // nerden getircek>>harflerArray'inden getirecek
        ) {
            if (kullanimSayilari.containsKey(each)) { //Map'im key dedigim ve parcalara ayirdigim harfleri iceriyorsa
                kullanimSayilari.put(each, kullanimSayilari.get(each) + 1);//map'e element koy,each(gelen her bir harf)
                //eski degerimi bana getir ve bir artir>>ornegin H harfini once getirdi sonra bir artirdi
            } else {  //aradigim element map'te yoksa buraya gec
                kullanimSayilari.put(each, 1);//o harf bir tane olmus olacak
            }
        }
        System.out.println(kullanimSayilari);
    }


}

