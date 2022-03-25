package day16_methodCreation;

public class C01_MethodlleSifreKontrol {
    public static void main(String[] args) {



        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali


        //  bu 4 kontrolu method ile yapin   //bu dort kontrolu sartları birbirinden bagımsız olarak kontrol etmeliyiz ki
        //  hatalarimizi tek seferde versin
        //yoksa her seferinde git geri gel yasayacagız


        String sifre="Abc123abn"; //kullanıcıdan sifre istedik ve aldık

        //Boolean atamamız gerekti
        //hepsi true olursa sifre basarılı yoksa basarisiz



        //asagıdakiler neden boolean ?  cunku kontrol et diyoruz cevap true ya da false gelecegi icin
        boolean ilkHarfKontrol= ilkHarfKontrolEt(sifre); // ilk harfi kontrol etmesi icin sifre yazmam lazım
        //ilk harf kontrolu yaptık ve sonucunu boolean bir seye atadık
        boolean sonHarfKontrol= sonHarfKontrolEt(sifre);
        boolean boslukKontrol= boslukKontrolEt(sifre);
        boolean uzunlukKontrol= uzunlukKontrolEt(sifre);
        // uzunlukKontrol>>>>variable ismi   uzunlukKontrolET>>>>> create ettigimiz method ismidir
        //method isimlerini method'u anımsatacak sekilde veriyoruz

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol){  //icindekiler zaten boolean  //if true oldugunda calısacak
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin"); //else false oldugunda calısacak
        }
    }
    private static boolean uzunlukKontrolEt(String sifre) {  //return type boolean olarak otomatik olustu
        boolean uzunlukKontrolSonuc=false;    //false ya da true yazmamızın hicbir onemi yok ama yazmak zorundayız?vevap ilerde ogrenecegiz
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
            uzunlukKontrolSonuc=false;
        }
        return uzunlukKontrolSonuc; //return yazmazsak itiraz eder
    }
    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=true;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
        }
        return boslukKontrolSonuc;
    }
    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc=false; //bu false 'u biz sectik true da secebilirdik
        char sonHarf=sifre.charAt(sifre.length()-1);

        if (sonHarf>='a' && sonHarf<='z'){
            sonHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
            sonHarfSonuc=false; //bunu yazmaya gerek yok aslında zaten ilk sart saglanmazsa burası false verir
        }
        return sonHarfSonuc;
    }
    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if (ilkHarf >= 'A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
            ilkHarfSonuc=false;
        }
        return ilkHarfSonuc;   //return keyword :eger return type ne ise keyword de aynı olmalı
        //ornegin integer bir return type integer verir




        //method cagırırken parantez icine yazilan degerlere argumnets denir
        // public static void main(String[] args)
        //toplama (5,6);

        // public static void toplama (int i, int j){    burdaki int kısımları ise parametredir
        //arguments ile parametreler uyumlu olmalıdır





    }

    }






