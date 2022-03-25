package day14_halaStringManipulation;

public class C05_sifreKontrol {
    public static void main(String[] args) {



        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali


        // dort tane kontrol olmalı
        // toptan hatalarımızı versin istiyorsak if'lerin hepsini bagımsız yapcaz
        //tek tek hata versin dersek if else ile baglardık hepsini


        String sifre="Asdf12345a"; // kullanıcıdan aldıgımız sifre
        boolean ilkHarf= false;

        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z'){// sıfrenın lk harfinin buyuk olmasını kontrol ettik
            ilkHarf=true;  //char kullandık cunku karsılastırma yapcaz
            //ilk harf A ile Z arasında ise true olmalı
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
        }
        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){ //son haarfi bulmak icin length()- ' kullancaz
            sonHarf=true;  //son harf a ile z arasında ise true vermeli
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }
        boolean bosluk= false;
        if (!sifre.contains(" ")){  //sifre bosluk icermiyorsa true verecek
            bosluk=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){ //sıfre ez sekız harf olursa true vercek
            uzunluk=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi"); //dordu de true ise alttaki output verir
            //bagımsız if lerde digerlerinde hata yoka sonuncu if calısır bu yuzden hatasız girdilerin sonucunda
            // sonuncu if devreye girdi ve  "sifreniz basarili bir sekilde kaydedildi" dedi.



            //calıstırınca basarısız olan her seyi bir kerede soyler
            //bu sorudaki sartlar birbirini baglamadıgı icin bagımsız if'ler kullandık
            //hepsini bagımsız yaptıgımız icin istenen ifadelerde boolean true yaptık

        }
    }
}
