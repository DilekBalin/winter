package day35_inheritance;

public class Isci extends Personel{

    public static void main(String[] args) {


        Personel objPersonel=new Personel();
        objPersonel.isim="Eren";
        objPersonel.soyisim="Terzioglu";
        objPersonel.adres ="Amsterdam";

        Isci objIsci=new Isci();//Parent class ta isci ile ilgili bir veri yok
        objIsci.isim="Huseyin";
        objIsci.soyisim="Efe";
        objIsci.adres="Ankara";
    }
}
