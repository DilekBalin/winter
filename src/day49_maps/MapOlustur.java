package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        //herkes ulasabilsin diye public
        // herkes gorebilsin yani obje olusturmaya ihtiyac olmasin diye static
        //Bir tane Map dondursun diye Map<Integer,String>



            Map<Integer,String> sinifList = new HashMap<>();
            sinifList.put(101,"Ali, Can, Dev");
            sinifList.put(102,"Veli, Yan, QA");
            sinifList.put(103,"Ali, Yan, C#");
            return sinifList;

    }
}
