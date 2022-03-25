package groupWork.MethodForWhile;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
          /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int input = scan.nextInt();
        int i =0;

        while (i<=input){
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
