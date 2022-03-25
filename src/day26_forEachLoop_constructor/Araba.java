package day26_forEachLoop_constructor;

public class Araba {
    /*
    Javada her class olusturdugumuzda
    Java o class'tan ilerde objeler olusturmak gerekecegini bilir
    ve biz ozellikle belirtmesek de
    Java her olusturdgu  class'a bir constructor koyar


    Jav'nın class olusturuken class' koydugu constructor'
    DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

    Eger biz gorunur bir constructorumuz olsun istersek
    default constructor ile aynı gorevi yapan bir constructtor da olusturabiliriz
    vey aistersek aynı  kalıptan farklı desenlerde objeler olustrumak icin
    farklı ozelliklerde constructorlar da olusturabiliriz


    Constructor'ları birbirinden farklı  kılan tek ayrıcalık
     parametre sayısı ve parametre data turudur


        */

    public Araba() {
        System.out.println("parametresiz constructor calisti");

    }

    /*Bir kod blogunun method ya da constructor olmasından emin olmak istityorsanız
    iki seye dıkkat etmelisiniz
    1.Constructorlar'ın ismi class ismi ile aynı olmak zorundadır yani buyuk harfle baslar
    2.Constructorlar'ın return typ'ı olmaz


    Ozetle:Constructoruların adı class ismi ile aynı olmalı
    ve return type olmammalı
     */

    public Araba(String renk) {  //bir constructor olusturduk

        System.out.println(renk + "renkli bir araba uretildi");   //araba runnerdan arattıgımızda gelecek String olan
        //bir constructor bulacak ve oraya yazdıgımz metni burakiyle birlestirip yazdıracak
        // mavi renkli bir araba uretildi
    }

    public Araba(int yil) {   //int olan constructor'u bulacak ve //'2023 model bir araba uretildi' yazacak

        System.out.println(yil + "model bir araba uretildi");
    }

    public Araba(int yil, String renk) {
        System.out.println(yil + " model " + renk + " renginde bir araba uretildi");


    }

    public Araba(int yil, String renk, int vites) {
        System.out.println(yil + " model " + renk + " renginde " + vites + " vites bir araba uretildi");
    }
}