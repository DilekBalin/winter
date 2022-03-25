package day12stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {


        //kullanicidan isim soyisim bilgisini alıp tum harfleri yildiz yapin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isimSoyisim = scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));
        //isim ve soyisim degistirmek istemiyorum sadece yazdirmak istiyorum
        //

    }
}
