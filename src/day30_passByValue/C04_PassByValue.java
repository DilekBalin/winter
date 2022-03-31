package day30_passByValue;

public class C04_PassByValue {


    //eger bir method'ta yapilan degisiligin kalici olmasini istiyorsaniz
    //iki yontem kullanabiliriz
    //1- variable'i class level'da static olarak olusturabilirim

    static double etiketFiyati;
    static double indirimYuzdesi;
    public static void main(String[] args) {

        etiketFiyati=100;  //etiket fiyati static oldugu icin direkt ulastim obje yazmadan
        indirimYuzdesi=10;
        kaliciIndirimYap();
    }
public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
    System.out.println("Indirimli fiyat: "+ etiketFiyati);

}

}
