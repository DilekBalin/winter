package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin


            Scanner scan =new Scanner (System.in); //mesaj vermeden de konsol da girdi girilir
            String kelime=scan.next();
            System.out.println(kelime.length()+" harfli bir kelime girdiniz");

            if(kelime.length()==4) {
                char bir=kelime.charAt(0);
                char iki=kelime.charAt(1);
                char üc =kelime.charAt(2);
                char dört=kelime.charAt(3);
                String tersOkunus= dört+""+üc+""+iki+""+bir+""; //bu eklemeyi string manipulation yapmak icin ben yaptim
                System.out.println("girdiginiz "+ kelime.toUpperCase()+" kelimesinin tersten okunusu:"+ "\n"+ tersOkunus.toUpperCase());



            }else if (kelime.length()<4){
                System.out.println("giridiginiz "+ kelime.toUpperCase()+ " kelimesi 4 harften az oldugundan degerlendirme yapilmadi");

            }else {
                System.out.println("Girdiginiz "+ kelime.toUpperCase()+ "  kelimesinin uzunlugu 4 karakterden fazla oldugundan degerlendirme yapilmadi");

            }
            scan.close();
    }
}
