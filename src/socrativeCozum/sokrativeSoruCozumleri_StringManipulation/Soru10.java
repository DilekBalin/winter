package socrativeCozum.sokrativeSoruCozumleri_StringManipulation;

public class Soru10 {
    public static void main(String[] args) {

        String str="Canan Can";
        //Hangileri ekrana true yazdırır?

        //A
        System.out.println(str.startsWith("c"));
        //kucuk degil buyuk c ile baslıyo //
        // false

        //B
        System.out.println(str.endsWith("n"));
        //true

        //C
        System.out.println(str.startsWith("a",3));
        //3.index ve sonrası a ile baslar
        // true


        //D
        System.out.println(str.endsWith("Can"));
        //C ile bitiyo
        //true

        // cevap: B,C,D

    }
}
