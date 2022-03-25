package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {


         // verilen iki sayiyi toplayip yazdiran bir method olusturalim
        //yazdır dedigi icin bana bi sey dondurmez dolayısıyla void olmalı

        int sayi1=10;
        int sayi2 =20;

        ikiSayiTopla(sayi1, sayi2); // method create ettik once isim sonra parametre aralara virgul koyarak



        // iki double sayinin toplamini yazdiran bir method olusturalim
        double sayi3=15.2;
        double sayi4=10.3;


        ikiSayiTopla(sayi3 , sayi4); //ilkin calısmaz cunku argumentler ile parmetreler uyumlu degil
        //biri double digeri integer
        //yaklastıgımızda bize bir suru cozum yolu onerir
        //biz "Create method ikisayiTopla in C03_Overloading"i secmeliyiz
        //bunu yaptıktan sonra normalde ikiSayiTopla isminde bir method'umuz varken yenisini olusturdu
        //ikisinin farkı parametrelerinin farklı olması biri double oldu digeri integer


        // eger variable olusturmadan direk sayilari yazarak method call yaparsam

        ikiSayiTopla(15,25); // int toplam verir  //sectigimize bakmaz hangi sayı hangi variable
        // uygunsa onunla ilgili islem yapar
        ikiSayiTopla(10.1,12.3); // double toplam verir


        // bir integer ile bir double toplamini yazdiran bir method olusturalim
        int sayi5=3;
        double sayi6=3.2;
        ikiSayiTopla(sayi5,sayi6); // sayi5:integer, sayi 6:double   //PARANTEZ İCİ ARGUMENTS
        //elimizde iki tane method  var: >>> double double  ,  integer integer
        //ama bu sayılarımın ilki integer ikincisi double
        // integer doubla'a sıgar digeri de zaten double oldugu icin sorun yok
        //dolayısıyla ikisi de uyumlu oldugu icin 1.method yani double double calısır

        //2.method calısmaz cunku ilk sayi integer oldugu icin sorun olmaz
        // ama double , veri kaybı olmadan integer'a sıgmaz
        //dolayısıyla parametreler ile argumnets arasında uyumsuzluk olur ve 2.method calısmaz

        //sonuc bize 1.method'la uyumlu olarak double gelir



    }
    //private static void ikiSayiTopla(int sayi3, double sayi4) {   //parametre
      //  System.out.println("Bir integer bir  double toplami : " + (sayi3 + sayi4) );


    // boyle bir soru icin: elimizde aynı isimde 3 tane method oldu  ama Java hangisini calıstırcak? >>>optimum olanı
    //Java  ikiSayiTopla(sayi5,sayi6); sorusunu gordugunde elinde ikiSayiTopla methodu var mı once ona bakar
    //evet var ustelik 3 tane ancak bu son atadıgımız en optimum olandır cunku
    //sayi 5 integer parametrede de ilki integer
    //sayi 6 double parametrede de ikincisi double
    //dolayısıyla hicbir EKSTRA islem YAPMADAN direkt sayıları toplar



    //2.method'ta ise ilk parametre de ikinci parametre de double
    //ilk argument integer ve double'a sıgar ama Java Casting yapar
    // ikinci argument double oldugu icin ekstra bis islem yapmaz
    // sonucu   EKSTRA  bir islem  (casting) YAPARAK yazdırır


    //3.method zaten calısmıyordu yukarıda yapmıstık

    // KISACASI
    // EN OPTIMUM COZUMU SECTİ YANİ HIC EKSTRA İSLEM YAPMADAN KULLANDIGI ILK OPSIYONU




    //JAVA aynı isim ve aynı parametrelerle birden fazla method olusturulmasına izin vermez
    //aynı isimle birden fazla method olusturmak isterseniz method signature'ın degistirilmesi gerekir
    //  METHOD SIGNATURE :method ismi +argumnets'lerden olusur
    //Biz bu signature'ları yaptık
    //ikiSayiTopla int double
    //ikiSayiTopla double double
    //ikiSayiTopla int int


    //method sıgnature NASIL DEGİSTİRİLİR?
    //parametrelerin data tipleri degistirilebilir
    //parametrelerin sayısı degistirilebilir
    //parametre sayısı aynı olmak zorundaysa parametrelerin sırası degistirilebilir  //pametre sayısı sınırı yoktur
    // Method'un return type'ını,access modifier'ını degistirmek
    // ya da static kelimesi eklemek method signature degistirmez

    private static void ikiSayiTopla(double sayi3, double sayi4) {   //  PARAMETRE  bu kısımdır
        System.out.println("iki double toplami : " + (sayi3 + sayi4) );
    }
    private static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : " + (sayi1+ sayi2)); //yazdırmak icin
    }//return type ihtiyac yok cunku sadece yazdır demis


    //bir calss'ın icinde aynı isimde birden fazla method olabilir buna overloading denir
    //hangisini kullanacagına Java yazdıgımız argumentlere gore krar verir


 }


