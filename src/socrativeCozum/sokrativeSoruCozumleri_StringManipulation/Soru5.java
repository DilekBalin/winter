package socrativeCozum.sokrativeSoruCozumleri_StringManipulation;

public class Soru5 {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        //Asagıdakilerden hangileri yanlıstır?


        //A
        System.out.println(str1.equals(str2));
        //Ekrana true yazdırır
        // yanlıs cunku buyuk kucuk harf farkı var

        //B
        System.out.println(str1.equalsIgnoreCase(str2));
        //Ekrana true yazdırır
        //dogru cunku ıgnore etti



        //C
        System.out.println(str2.equals(str1));
        //Ekrana false yazdırır
        //dogru false verir kucuk buyuk harf uyumsuzlugundan dolayı

        //D
        System.out.println(str2.equalsIgnoreCase(str1));
        //Ekrana false yazdırır
        // yanlıs ekrana true verir cunku ıgnore etti

        // Yanlıs cevaplar A ve D sıkları




    }
}
