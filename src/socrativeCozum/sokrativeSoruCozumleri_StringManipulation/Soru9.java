package socrativeCozum.sokrativeSoruCozumleri_StringManipulation;

public class Soru9 {
    public static void main(String[] args) {


        String b="Ali 12 ?_";

        //Asagıdakilerden hangisi yanlıstır?


         //A
        System.out.println(b.replaceAll("\\d","*")); //butun rakamları yıldız yap
        //Ekrana Ali ** ?_ yazdırır ///dogru

       //B
        System.out.println(b.replaceAll("\\D","*")); // rakamlar haric her seyi yıldız yap
        //Ekrana ****12*** yazdırır //dogru

         //C
        System.out.println(b.replaceAll("\\S","*"));// bosluklar haric her seyi yıldız yap
        // Ekrana *** ** ** yazdırır //dogru

         //D
        System.out.println(b.replaceAll("\\w","*")); // tum harf ve rakamları yıldız yap //*** ** ?*
        //Ekrana Ali*12**_ yazdirir


        //cevap D

    }
}

