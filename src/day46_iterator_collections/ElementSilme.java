package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElementSilme {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        Iterator<String> l1=list.iterator();
        while(l1.hasNext()){ //yaninda elemean oldugu muddetce yana gidiyoruz
            l1.next(); //bir sonraki eleamni getiriyor
            l1.remove(); //elindeki her elemani sirayla siliyor

        }
        System.out.println(list); //  []
    }
}
