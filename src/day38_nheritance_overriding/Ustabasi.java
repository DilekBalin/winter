package day38_nheritance_overriding;

public class Ustabasi extends Isci {
    public String statu = "Ustabasi";
    public String haklar = "Ustabasi haftada bir gun ekstra tatil hakkina sahiptir";


    public void mesai() {
        System.out.println("Ariza varsa ustabasi ekstra ucet almadan  calisir");
    }

    public void maasHesapla() {

        System.out.println("Ustabasi haftada 30 gun * 8 saat *12 euro= " + (30 * 8 * 12) + "euro maas alir");
    }

     public static void main(String[] args) {

        /*
        icinde oldugumuz class'tan klasik haliyle bir obje olusturursak
        o obje ile cagirdigimiz variable ve method'larda
        Java once iicnde bulunduguuz class'a bakar
        Aradigimiz class uyesi icinde bulundugumuz class'ta varsa onu getirir.
        YOKSA
        parent class'lara bakarve ilk buldugunu getirir
         */
        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.statu); //Ustabasi
        System.out.println(yasin.haklar);//"Ustabasi haftaa bir gun ekstra tatil hakkina sahiptir";
        System.out.println(yasin.ikramiye);//"Isciler yilda bir ikramiye alir";
        System.out.println(yasin.izin); // "Tum  personel yilda 4 hafta izin kullanir";
        yasin.maasHesapla();
        yasin.mesai();

        System.out.println("*************************");
        /*
        Eger isci olarak ozelliklerini gormek istersek
        Class adini (data turunu) isci seceriz
         */
        Isci ahmet = new Ustabasi();    //const ustabasi ve bu ilkin bu class'i kullanir ve bu class'in ozelliklerini kullanir
        //ama data turu isci oldugu icin onun ozellikelrini getirir
        System.out.println(ahmet.statu);  //Isci ------
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar=--------
        System.out.println(ahmet.ikramiye); // Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin); // Tum  personel yilda 4 hafta izin kullanir
        ahmet.maasHesapla();
        ahmet.mesai();

        System.out.println("*********************");
        /*
        Siz bir objeyi hangi class'tan tanimlarsaniz o class'a ait ozelliklere sahip olur
         */

        Personel adem = new Ustabasi();
        System.out.println(adem.statu);  // Personel
        System.out.println(adem.haklar); // Tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye); // CTE verir cunku personel class'inda ikramiye diye variable yok ve parent class child class'in ozelliklerini tasimaz
        System.out.println(adem.izin); // Tum  personel yilda 4 hafta izin kullanir
        adem.maasHesapla();
       adem.mesai();

        /*
        Personeladem=new Ustabasi();    >>> Bu bır ustabasi objesidir
        Personel adem=new Personel();    >>>>Bu ıse   personel objesidir
        */


        /*
        Personel adem = new Ustabasi();  >>>esitligin solu data turudur
        Bir objenin ne oldugunu anlamak istiyorsaniz data turune bakmalisiniz

        adem'in data turu Personel'dir
        boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        ancak ben adem'in ustabasi oldugunu biliyorum cunku
        constaructor'i ustabasi
        ama bu yazin formati ile
        adem'in tum perssonel ile birlikte sahip oldugu ortak ozellikleri vurgulamak istiyorum.

        Bu kullanim seklinde olusturulan obje data turu olarak secilen class ve
        onun parent classilarındakı varıableiları kullanabılır



                 */

    }

}
