package day39_overriding;

public class Corolla extends Toyota {

    protected String hiz = " Corolla maksimum 200 km hiz yapar";
    protected String yakit = "Corolla benzin veya elektriklidir";
    protected String model="Corolla";

    public void motor() {
        System.out.println("Corolla araclar cevre dostu motor kullanir");
    }

    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 litre yakit tuketir");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 viteslidir");
    }


    public static void main(String[] args) {
        /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin
        obje Constructor'in oldugu ozellikleri tasir
        ancak adata turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir

        method'lar icin ise yine data turunun oldugu class'a gideriz
        ancak direkt method'u calistrimadan once
        method Override edilmis mi diye kontrol ederiz
         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket);  //Araba class'indan alir
        System.out.println(arb1.hiz); //bu class'tan aldik
        System.out.println(arb1.yakit);  //bu class'tan alir
        System.out.println(arb1.marka);  //Toyota class'indan alir
        System.out.println(arb1.sirketMerkezi);   //Toyota Class'indan alir
        System.out.println(arb1.model); //corolla class'indan alir
        arb1.motor();  //Corolla dan geldi //Data turu de constructor corolla oldugu icin sorun olmaz
        //bu Classtan motor degerini alir


        Toyota arb2 =new Corolla();
        System.out.println(arb2.hareket);  //Araba class'indan alir
        System.out.println(arb2.hiz); //Toyota class'tan aldik
        System.out.println(arb2.yakit);  // Araba class'indan alir
        System.out.println(arb2.marka);  //Toyota class'indan alir
        System.out.println(arb2.sirketMerkezi);   //Toyota Class'indan alir
        //System.out.println(arb2.model); // CTE verir parent 'tan child class'a doenemz
        arb2.motor(); //Corolla
        arb2.garanti(); //Toyota'dan gelir
        arb2.yakitTuketimi();  //Corolla
      //  arb2.vitesSayisi();   //bulmak icin aramaya data turu olan Toyota class'indn basliyoruz ve boyle bir method yok
        //onun da parent'ina bakiyoruz ve orda da yok
        //CTE verir calismaz

        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket);  //Araba class'indan alir
        System.out.println(arb3.hiz); // Araba class'tan aldik
        System.out.println(arb3.yakit);  // Arabaclass'tan alir
        System.out.println(arb3.marka);  // araba class'indan alir
        //System.out.println(arb3.sirketMerkezi);   //CTE verir
       // System.out.println(arb3.model); //Cte verir
        arb3.yakitTuketimi();  //araba classinda yakitTuketimini buldu ve sirayla  child class'lara bakacak
        // en guncel olan overriding kabul eder
        //corolla class'ndaki methodu calistirir
        arb3.motor(); //Corolla Class'indakini alir
        //arb3.garanti(); //CTE>>> cunku Araba class'inda aramaya basladi ve motor methodu yok
        //arb3.vitesSayisi();   //CTE ayni sebepten



    }

}
