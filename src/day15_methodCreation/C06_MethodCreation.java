package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // iki variable'n degerlerini toplayan bir method olusturalım


        //1.adım:
        // once method adını yazıp parantez koyalım
        // ikiSayiTopla();

        //2.adım:
        // methoda gondermem gereken arguman var mı?


        ikiSayiTopla(a,b); //methodun ismi:ikiSayiyiTopla
        // argumanlarım ise: a ve b
        // sadece araya virgul koyarak yazdık


        //ikiSayiTopla(a,b); >>>>Burayı silersek ekrana bir sey gelmez cunku bir method'u olusturmak calısması icin yeterli degıldır
        //method ancak cagırılırsa calısır
        //yani Java'ya ne yapması gerektigini soylemek gerekir
        ikiSayiTopla(60,123);   //bunda da calıstı cunku biz a ve b'ye istedigimiz sayıları verebiliriz
        //aynı variable'lari kullanmak zorunda degiliz

        C04.dortHarfiTersineCevir("Sema");
        //Baska class'ları da kullanabiliriz
        //onemli olan bizim cagırmmamız
        //aynı class veya farklı class'ta olmasının onemi yoktur
        //Java main method'u yukarıdan asagıya dogru calısır
        // ve geldigi satırda kendisinden ne istenirse onu yapar


    }  //Burada kodun calısması durur cunku burası main method'un sonudur


    // sonra da bize asagıdaki main methodu olusturdu

    private static void ikiSayiTopla(int a, int b) { //main den cıktık cunku burası da baska bir main method'tur

        System.out.println("verilen iki sayinin toplami:"+(a+b));


    }
}
