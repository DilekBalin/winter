package day11_stringManipulation;

import java.net.InetSocketAddress;
import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istemedigini soru
        // Evet derse cevabini ve "derse katilimiz alinmistir" yazdirin
        //hayir derse cevabini ve "Sonraki derslerimize bekleriz

       Scanner scan=new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz \nEvet veya Hayir");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katiliminiz onaylanmistir" );
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " Sonraki derslerimize bekleriz" );
        } else {
            System.out.println("lutfen evet veya hayir yaziniz");
        }








    }
}

