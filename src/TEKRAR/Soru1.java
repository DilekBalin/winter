package TEKRAR;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen islem icin + - / * sembollerinden birini giriniz");
        char sembol = scanner.next().charAt(0);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        hesapMakinesiYap(sembol, sayi1, sayi2);
    }

    public static void hesapMakinesiYap(char sembol, int sayi1, int sayi2) {
        if (sembol == '+' || sembol == '-' || sembol == '*' || sembol == '/') {


            switch (sembol) {
                case '+':
                    System.out.println("toplama islemi:" + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println("cikarma islemi:" + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println("carpma islemi:" + sayi1 * sayi2);
                    break;
                case '/':
                    System.out.println("bolme islemi:" + sayi1 / sayi2);
                    break;


            }
        }else{
            System.out.println("hatali sembol");
        }


    }
}