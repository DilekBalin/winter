package review.day2;

import java.util.Scanner;

public class SwitchTernary {
    public static void main(String[] args) {

/*
 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
 * ve o harfle baslayan gun isimlerini yazdirin
   Ornek:     ilkHarf=P output = �Pazar, Pazartesi veya Persembe�
   ilkHarf=S output = �Sali�
 *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
  switch ve ternary kullanarak cozun
 */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");
        char harf= scan.next().toLowerCase().charAt(0);


            switch (harf) {
                    case 'p':
                        System.out.println("pazar,pazartesi ya da persembe");
                        break;
                    case 's':
                        System.out.println("sali");
                        break;
                    case 'c':
                        System.out.println("carsamba,cuma veya cumartesi");
                        break;
                    default:
                        System.out.println("Hatali giris");
                }

         //Ternary

        String sonuc=harf=='p'?"pazar,pazartesi,persembe":harf=='s'?"sali":harf=='c'?"cuma,cumartesi,carsamba":"hatali giris";
        System.out.println("ternary ile: "+ sonuc);

            }


    }



