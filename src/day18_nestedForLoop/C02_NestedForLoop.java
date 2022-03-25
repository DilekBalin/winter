package day18_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        //nested loop iki degiskenle islem yaptıgımızda isimize yarar
        //tek sıra ya da tek sutun degılse mutlaka nested loop kullanılır



        // kullanicidan bir rakam carpim tablosu olusturalim
        int input=3;
        // 1 2 3   //carpım tablusu sekli boyle devam ederdi      1*1  1*2  1*3
        // 2 4 6                                                  2*1  2*2  2*3
        // 3 6 9                                                  3*1  3*2  3*3


        //once 1 sabit 1,2,3   //i 1ve 1,2ve 3 de j oluyor
        //sonra 2sabit 1,2,3
        //3 sabit 1,2,3  yazdırır




        for (int i = 1; i <=input ; i++) {   //saymaya 1'den baslarsak ve 1, inputtan kucukse
            //ilk for body'sine gire ve bakar ki bir body daha var yani j'ye gider
            //j icin de saymaya 1'den baslar ve sayı inputtan kucukse calısır ve sout icindeki islemi konsola yazdırır
            //yani i*j 1*1
            //sonra icerdeki loop'un sonuna gelir ve isleme icerdeki loop'la yani j ile devam eder
            //devamı j'de


            for (int j = 1; j <=input ; j++) {
                //icerdeki loop'ta geriye dondugunde java once artırma ya da azaltma yapar
                //j esittir 2 yapacak ,j kucuk esitt input true oldugu icin body calıscak ve
                //i*j  1*2
                //sonra yine bu loopun basına gelecek once arttırmayı yapacak ve j esittir 3
                //3 kucuk esitttir 3 true oldugu icin sout olur
                //i*j  1*3
                //loop sonunda yine bu body'nin basın agelir ve once artırma yaptırır
                //j artık 4 olur ve 4 kucuk esit 3 olmayacagı icin burda broken olur ve bu body 'i bitirecek
                //kod calısmaya devam edecek ve sout 'u gorur boylece bosluk yazdıracak
                //bu alt satıra inecek demektir yani outer'a girer
                //ama j'yi 0 almayalım
                System.out.print((i*j) + "  ");
            }
            System.out.println(""); // satiri asagiya gecirmek
        } // burası outer yani loop'un sonu
        //buraya gelen java basa doner ve bu sefer i=2 olur  ve 2 kucuk esit 3 oldugu icin true verir
        //i*j  2*1 2*2 2*3
        //aynı işlem 3 sayısı icin deolur
        //i*j  3*1 3*2 3*3 ve biter
        //j degerleri sabit :1  2 ve 3


        //outer loop deger aldıgında iner loop bastan sona calısır sonra outer loop deger degistirir



    }
}
