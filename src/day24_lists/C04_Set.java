package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        //set()method'u yazili dilinde update olarak gorulebilir
        //set() method'u add() method'u yerine kullanilamaz  yani sona bir elemnt ekelemk icin kullanamyiz
        //kisacasi olamayn bir index'e set yapamyiz
        //ornegin 3 elementimiz var ve 4.elementimiz yasemin olsun diyemeyiz  cunku 4.element yok ki nasil set yapalim?



        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin"); //Yusuf gitti,yerine Seckin geldi
        System.out.println(isimler); //[Aykut, Seckin, Ilker, Oguzhan]//


        //daha onceden listeden var olanları da arsiv gibi tutmak istersek
        //bir list daha olustururuz
        List<String> logListesi=new ArrayList<>();
        logListesi.add(isimler.set(2,"Cosmos")); //2iindex'tekini Cosmos yap
        //liste gitti İlkeri aldı yerine cosmos'u yaptı donerken bana ilkeri getirdi
        //ben de ilkeri alıp log listesine ekledim
        //bir satırda hem eski listemi guncelledim hem de silineni arsive ekledim


        System.out.println(isimler);  //[Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesi);  //[Ilker]


        //set methodu add methodu yerine kullanılamaz olmayan bir index ile set kullanılırsa exception verir
    }
}
