package socrativeCozum.sokrativeSoruCozumleri_StringManipulation;

public class Soru4 {
    public static void main(String[] args) {




        String str= "Java ah Java ";
        //Asagıdakilerden hangisi yanlistir?


        //A)
        System.out.println(str.contains("J"));
        //Ekrana true yazdırır
        //dogru cunku "J" harfi var

        //B)
        System.out.println(str.contains("x"));
        //Ekrana -1 yazdirir
        // ekrana false yazdırır -1 degil
        // //-1 iindexOf 'da calısır

        //C)
        System.out.println(str.contains("ja"));
        //Ekrana true yazdirir
        //dogru ekrana true verir

        // D)   Hicbiri
        //Dogru cevap C
    }
}
