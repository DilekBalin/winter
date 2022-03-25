package socrativeCozum.sokrativeSoruCozumleri_StringManipulation;

public class Soru11 {
    public static void main(String[] args) {

        String str = "Java code yaz";

        //A
        System.out.println(str.substring(5));
        // index 5 de dahil sonrasını yazdır // code yaz
        //ekrana code yaz yazdırır  //dogru

        //B
        System.out.println(str.substring(12)); //z
        //index 12 de dahil sınrasını yazdır
        //ekrana z yazdırır  //dogru
        //C
        System.out.println(str.substring(5, 9));//code
        //index 5 de dahil sonrasını yazdır 9.index'e kadar ama 9.index haric
        //ekrana code yazdırır //dogru


        //D
        System.out.println(str.substring(8, 8));
        // index 8 de dahil yazdır 8. indexe kadar 8 haric
        // hiclik ekrana hicbir sey yazmaz ama hata da vermez
        //ekrana hicbir sey yazdırmaz  //dogru

        //dogru cevap:A,B,C,D

    }
}