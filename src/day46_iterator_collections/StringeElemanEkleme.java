package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StringeElemanEkleme {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);//[A, B, C]

        for(String w:list){
            w+="X";
        }
        System.out.println(list);//[A, B, C]>>>>>>> degisiklik kalici olmadi


        ListIterator<String> list2=list.listIterator();
        while(list2.hasNext()){
            String str=list2.next();
            list2.set(str+"X");
        }
        System.out.println(list); //[AX, BX, CX] //kalici degisti
    }
}
