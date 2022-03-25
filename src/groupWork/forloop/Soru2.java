package groupWork.forloop;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
          /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti)
        ise true, değilse false return edin.

        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false
     */


        Scanner scan =new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(powerOfThree(sayi));

    }

    public static  boolean powerOfThree ( int sayi ) {
        boolean b=false;
        int carpim=1;

        for (int i = 1; i <sayi; i++) {
            carpim*=3;

            if (carpim ==sayi){
                b=true;
                break;

            }

        }
        return b;
    }
}
