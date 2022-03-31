package day31_immutableClass;

public class C01_Equals {
    public static void main(String[] args) {
        String str1="Eren";
        String str2="Eren";  //eger yeni bir obje olusturma ya da islem yapma yoksa java string havuzunu kontrol eder
        //yani zaten daha once de olustrulan br eren havuzu oldugu icin yeni degeri de oraya atar
        //yeni bir islem yapinca yeni bir obje olusturur

        String str3= new String ("Eren");
        String str4=str1+"";

        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.equals(str3));  //true
        System.out.println(str1.equals(str4));  //true

        System.out.println(str1==str2);  //true  //ikisinin referanslari da objeleri de aynidir cunku java onlari ayni yere koydu neden
        // cunku yeni bir islem ya da atama yapilmadi

        System.out.println(str1==str3);  //false //3.string olustrulurken yeni bir obje yapildi
        //java bunu yaparken once steak memory'de refeans verir sonra  heap 'te obje olusturur ve icerigine sonra bakar
        System.out.println(str1==str4);  //false  //yeni bir atama yapilmis java islemin sonucunu bilemez ve yeni bir obje olustuur
        //bunlar aslinda ayni icerige sahip olduklari halde referanslari farkli oldugu ucun == false verir
    }

}
