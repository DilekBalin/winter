package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C09_HSayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd=new Random();//burda yeni bir obje olusturduk
        //Kullanıcıdan sayı alacagız girdigi sayıyı bilgisayarın tuttugu sayi ile karsılastırcagaız
        //ne zamana kadar? tahmin edilen sayı ile tutulan sayı esit olana kadar


        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur //bu sınır randomun ozelligiidr
        Scanner scan = new Scanner(System.in); //kullanıcıdan bir tahmin almak icin olusturduk ve loptan once yaptık

        int tahmin=0; //kullanıcıdan gelen tahmin icin int olusturduk
        int sayac=1; //kac tahmin ettigini bulmak icin bir sayac olusturduk
        //sayacı 1'den baslattık cunku kullanıcı ilk seefrde dogru bilseydi java while pas gecer direkt sonucu yazdırırdı
        //eger 0'dan baslatsaydık ilk dogru cevapta 0 tahminde bulundunuz derdi bu yuzden sayacı 1 'den baslattık
        //kullanıcıdan gelen tahmin kac seferde dogru olacak bilmedigim icin while loop  la islem yaparız



        while (sayi != tahmin){//eger tahmin  sayıya esit degilse iki secenek vardır ya buyuk sayı girmeli ya da daha kucuk bir sayi girmeli

            System.out.println("Lutfen bir sayi giriniz");
            tahmin=scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi soylemelisin");
            } else if (tahmin<sayi){
                System.out.println("Daha buyuk bir sayi soylemelisin");
            } //neden else yazmadık cunku while basında esit degilse dedik zaten esit olursa loop broken olacak ve bastan alacaak
            sayac++; //loop bitmeden sayacı bir artıryoruz
        }
        System.out.println("Tuttugum sayiyi " + (sayac-1) + " tahminde buldunuz"); //sayac  -1 dedik cunku sayacı 1Den baslatmıstık

    }
}
