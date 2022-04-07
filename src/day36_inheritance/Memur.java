package day36_inheritance;

public class Memur extends Muhasebe{  //muhasebeyi parent yaptik ama biliyoruz ki
    //personel class'inin da tum ozelliklerini kullanabiliriz cunku
    //personel class'i muhasebenin parent 'i.

    public static void main(String[] args) {

        Memur memur1= new Memur();  //memur objesi olusturduk
        // memur1 objesi Memur class'inin objesi olmasina ragmen
        // inherit ettigi Muhasebe ve onun da Parent'i olan Personel
        // class'larindaki tum datalari alabilir

        // Personel class'indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";

        // Muhasebe class'indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2=new Memur();//ikinci bir memur olusturduk
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas=memur2.maasHesapla();
        System.out.println(memur2);

        //biz bu class't istedigimiz kadar memur olusturabiliriz ve
        //personel ile muhasebe class'indaki tum ozellikleri kullanabiliriz
    }
    @Override
    public String toString() {  //toString sayesindesout icine memur1 ya da memur2 dersek tum ozellikleri gorebiliriz.
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
    }

