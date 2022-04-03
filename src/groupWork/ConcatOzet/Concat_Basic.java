package groupWork.ConcatOzet;

public class Concat_Basic {
    public static void main(String[] args) {


        String str1= "Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //Variable'lerin degerlerini degistirmeden
        //bu variab'leri kullanarak yazin

        //Soru1:
        // Java5Guzel
        System.out.println(str1+sayi1+str2);


        //Soru2:
        // 2Guzel15
        System.out.println((sayi1-sayi2)+str2+sayi1*sayi2);


        //Soru3:
        // Java22
        System.out.println((str1+(sayi1-sayi2)+(sayi1-sayi2)));

        //Soru4:
        // 53Guzel
        System.out.println((""+sayi1+sayi2+str2));

        //NOT:
        //Eger tamamen sayilardan olusan bir string varsa ve biz bunu Integer' cevirmek istersek
        //iki yol deneriz:

        String a="50";
        String b="10";

        int sayi3=   Integer.valueOf(a);
        int sayi4 = Integer.valueOf(b);
        System.out.println("ValueOf ile toplam= " +(sayi3+sayi4));

         int sayi5=   Integer.parseInt(a);
         int sayi6 = Integer.parseInt(b);
        System.out.println("Parse ile toplam= "+ (sayi5+sayi6));


        //NOT:
        // bir sayiyyi Stringe cevirmek istersek sayiyi bir hiclikle toplariz.
        //""sayi

        int num=4;
        int num2=5;
        System.out.println(""+num+num2);


    }
}
