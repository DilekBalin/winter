package day09_ternary_Switch;

public class c03_Ternary {
    public static void main(String[] args) {

        int sayi= 50;

        //Verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        //ve sonucu yazdiran bir ternary yazdirin

       String sonuc =sayi>=100? "Sayi 3 basamakli veya daha buyuk":"sayi negatif 3 basmaktan kucuk";
        //Ternary bize sonuc dondurdugu icin
        //ya bu sonucu direk yazdirmaliyiz
        //ya da sonucun data turune uygun bir variable'a atama yapabiliriz
        System.out.println("Girdiiginiz sayi analizi :" + sonuc);


    }


}
