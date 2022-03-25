package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        /*
     Task:
      * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
      * toplamini dondursun.
      *
      * Ornek
      * input : ade1r4d3
      * output : 8
      * Ipucu:
      *     Character.isDigit()// String'deki karakterin digit olup olmadigina bakar.
      *     Integer.valueOf()
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir string degeri giriniz");
        String str=scan.next();

        digitToplami(str);

    }

    private static void digitToplami(String str) {
        int sum=0;
        for (int i=0; i<str.length(); i++){
            if( Character.isDigit(str.charAt(i))){
                sum+= Integer.valueOf(""+str.charAt(i));
            }
        }
        System.out.println(sum);

         /*
         2.yol
         int sum=0;

         for (int i=0; i<str.length(); i++) {

              if (Character.isDigit(str.charAt(i))) {     sum+=Character.getNumericValue(str.charAt(i));
     } }
     System.out.println(sum);
     }

          */

     /*
     3.yol
     Int sum=0;
         for (int i=0; i<str.length(); i++) {
          if(str.charAt(i)>='0' &&  str.charAt(i)<='9'){
             sum+=(str.charAt(i)-'0');
                   }
     }
     System.out.println(sum);

 }
             /*
         0 (dahil)-9(dahil)
         araligindaki butun rakamların ascii degerleri 48-57’e
         kadar birer birer artıyor. Yani 0=48, 1=49….9=57.
         3.yolda parantez içerisinde charAt() ascii degerini isleme koyacak,
         onun integer degerini ortaya çıkarmak icin ornegin 1’in ascii degeri
         yani 49’dan 0’in ascii degeri 48’i cikarirsak int 1’in degerini elde etmiş oluruz.
      */
    }
}
