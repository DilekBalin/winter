package review.day2;

import java.util.Scanner;

public class If {
    /*
 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
 * ve o harfle baslayan gun isimlerini yazdirin
   Ornek:     ilkHarf=P output = �Pazar, Pazartesi veya Persembe�
   ilkHarf=S output = �Sali�
 *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

 */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen gun isminin ilk harfini  giriniz:");
        char c=scan.next().charAt(0);
        if (c=='p'){
            System.out.println("Pazartesi,pazar veya persembedir");
        }

if(c=='s'){
    System.out.println("sali");
}
if(c=='c'){
    System.out.println("cuma veya cumartesi");
}
if (!(c=='p'&&c=='c'&&c=='s')){
    System.out.println("hatali giris");
    System.out.println("*************************");

}
 //2.yol:
        switch(c){
            case 'p':
                System.out.println("pazartesipersembe,pazar");

        }
        {

        }

    }

}
