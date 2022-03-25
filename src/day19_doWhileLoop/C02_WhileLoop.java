package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // ) Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin




        int input = 15687456;  //kullanıcı girdigi sayı olsun
        int rakam = 0;
        int rakamlartoplami = 0;

        while (input > 0) { //input 0'dan buyuk oldugu muddetce calıssın be bu islemi tekrar tekrar yapsın
            rakam = input % 10; // //ilk islem icin rakamı verecek her once burda 6Yı alacak onra 5'i sonra 4'u...
            rakamlartoplami += rakam; //rakamlar toplamına rakamı ekle
            input /= 10; //virgulden sonraki sayıdan kurtul

        }

        System.out.println(rakamlartoplami);   //eger bunu loopun icine yazarsak herbir adımda yazdırır
    }
}
