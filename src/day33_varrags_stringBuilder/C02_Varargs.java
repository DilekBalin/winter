package day33_varrags_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int
        //ve istedigimiz kadar String alan
        //en uzun kelimenin harf sayisi ile int parametre degerini carpip
        // sonucu yazdiran bir method olusturun

        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3= "Ali";

        carpim(sayi,str1,str2,str3); //methodun icine sayi once basta olmali cunku parametreler eslesmeli
        //bir methodta varargs disindaparametre kullanacaksak once diger parametreleri yazip varargs i en sona yazmaliyiz
    }

    private static void carpim(int sayi, String...str) {   //int bir tane varrargs yapmaya gerek yok
     // private static void carpim( String...str'int sayi)  //kabul etmez
        //cunku bir methodta vararg disinda baska bir sayi olursa varargs basa yazilmaz
        //bu sebeple bir method'ta birden fazla varargs olamaz
        String enUzunStr = "";
        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }

        System.out.println("istenen deger : "+sayi*enUzunStr.length());
    }
}
