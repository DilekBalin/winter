package day31_immutableClass;

public class C02_Equals {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        System.out.println("a= " + a);
        if (a == "2cfalse") {
            System.out.println("=="); //equals   //cunku biz a yi her seferinde islemden gecirdik ve bu hale getirdik
            //dolayisiyla java ikisini esit kabul etmedi
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals"); //==
        }


        String b = "2cfalse";

        if (b == "2cfalse") {
            System.out.println("=="); //equals  //burda b basit haliyle olusturuldugu icin esit kabul etti
        }
        if (b.equals("2cfalse")) {
            System.out.println("equals");
        }
    }
}