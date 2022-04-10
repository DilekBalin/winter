package day40_overriding_polymorphism;

public class C02 extends C01 {


    private void method4() {
        System.out.println("Parent method4");

        //Parent class'taki private method4'e child class'tan ulasmamiz mumkun olmadigindan
        //Java bu iki methodu  TAMAMEN FARKLI IKI METHOD olarak kabul eder
        //@Override kullanmak istersek Java kabul etmez CTE verir

    }

    @Override
    protected String method3() {
//Covariant icin yazildi
        return "Java";
    }

    @Override //burayi silersek parent 'ta yapilan degisiklik burada hata verebilir
    public void method2() {
        /*
         @Override  notasyonu overridden method ile overriding method'u
         birbirine baglar
         Farkinda olmadan overriden method silinirse veya signature degistirilirse
         bu iliski bozulacagi icin Java CTE verir

         Notasyo kullanilmazsa Java bunlarin iliskisini bilir ama
         overrriden method silinirse sesini cikarmaz
         */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {

        C02 obj = new C02(); //hem cons hem de data tutu icinde bulundugumuz class'tan alir
        obj.method1();  //   parent'tan method1 calisir cunku bu class ta yok parente gider
        obj.method2(); //Child method2

        C01 obj2 = new C02();
        obj2.method1();   //once data turune bakar ve parent'e gider
        //method 1 'i buldu ancak overriding yapilmis mi diye child'e geri gelir
        //method 1 overrride edilmemis ve paarent 'taki calisir
        obj2.method2(); //C02'dekini getirir

        C01 obj3 = new C01(); //data turu de constructor da C01 , her sey C01 'de oraya gider bu class'la isim yok
        obj3.method1(); //parent method 1
        obj3.method2(); //parent method 2
    }


}
