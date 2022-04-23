package day51_Maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenEleemntleriListele {
    public static void main(String[] args) {
        /*
Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
 map>>>{ 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
 Istenen dil >>>> java
 Sonuc >>>>[Ali, Veli]
         */
            Map<Integer,String> sinifMap=  MapOlustur.myMap();  //MapOlustur class'indaki myMap()'i cagirdik ve
        //bu class'imizda kullanbilmek icin bir Map'e atiyoruz
            String istenenDil="Dev";//istenen dili bilenelr stringe atandi
             List<String>istenenDiliBilenListesiOlustur=istenenDiliBilenListesiOlustur(sinifMap,istenenDil); //return edecegimiz method'u create ettik
        ///ve bir list'e atadik
        System.out.println(istenenDiliBilenListesiOlustur(sinifMap, istenenDil));//sout'a attik ki bize yazdirsin

        }
        public static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {
            List<String> istenenDiliBilenlerListesi = new ArrayList<>();

            //key'ler ile isimiz yok sadece value'lerle ugrasacgiz
            Collection<String> sinifValueColl =sinifMap.values();//sinifMap.values() deyince  yani olusturdugumuz Map'teki valueler'i allacagiz
            //bunlari bir collection'a attik cunku intelliji istiyor bunu
            List<String> sinifValueList=new ArrayList<>();
            sinifValueList.addAll(sinifValueColl);
            int outerArrayBoyut= sinifValueList.size();
            String ilkValue=sinifValueList.get(0);
            String ilkValueArray[]=ilkValue.split(", ");
            int innerArrayBoyut=ilkValueArray.length;
            String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
            for (int i = 0; i <outerArrayBoyut ; i++) {
                String temp[]=sinifValueList.get(i).split(", ");
                for (int j = 0; j <innerArrayBoyut ; j++) {
                    valueMDArr[i][j]=temp[j];
                }
            }
            System.out.println(Arrays.deepToString(valueMDArr));
            for (int i = 0; i <outerArrayBoyut ; i++) {
                if (valueMDArr[i][2].equals(istenenDil)){
                    istenenDiliBilenlerListesi.add(valueMDArr[i][0]);
                }
            }
            return istenenDiliBilenlerListesi;
        }

    }

