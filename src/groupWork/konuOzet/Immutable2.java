package groupWork.konuOzet;

import java.util.ArrayList;
import java.util.List;

public class Immutable2 {
    public static void main(String[] args) {


        String str="Mehmet";  //buyuk harfle yazdir ve degisti  mi gor

        List<String > list=new ArrayList<>();//  list.add ile ekleme yap ve degisti mi gor

        String s="Ali"; //yeni deeger ata ve sonucu gor


        String a = "";
        a += 2;
        a += 'c';
        a += false;
        System.out.println("a= " + a); //
        if (a == "2cfalse") {
            System.out.println("birbirinin aynisidir");
        }
        if (a.equals("2cfalse")) {
            System.out.println("farklidir");
        }


        String b = "2cfalse";

        if (b == "2cfalse") {
            System.out.println("==");
        }
        if (b.equals("2cfalse")) {
            System.out.println("equals");
        }
    }
}