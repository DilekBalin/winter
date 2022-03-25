package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //Bazen ternary'deki iki sonucun data turleri farkli olabilir
        //Verilen sayi 100'den buyukse sayi 'nin karesinin alıp yazdiran
        //100'den kucukse "sayi 100 de buyuk olmalı yazdıran  bir Thernary olusturalim

        int sayi=16;
        //ternary bize sonuc getirdiginden ya sonucu direkt yazdirmaliyiz
        //veya bir degiskene atamaliyiz
        //eger sonuclar farkli data turlerinde ise atama yapacagimiz variable'nin
        //data turu tek olacagından atama yapamayız
        //sadece direkt yazdirabiliriz.

        System.out.println(sayi>100 ? sayi*sayi:"sayi 100'den buyuk olmali");
    }
}
