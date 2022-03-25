package day15_methodCreation;

public class C07_Devami {
    public static void main(String[] args) {

        // string'i yazdiran method olusturalim
        // hosgeldiniz diyen bir method olusturun
        // kapanma mesaji yazan bir method olustur

        hosgeldinYazdir();  // parametre yazmadık cunku zaten ne yazdıracagımız belli:"Hosgeldin"
        // method call yani method cagırma yaptık
    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz"); //en son bu calısır
        //bu satırdan sonra
    }

    private static void hosgeldinYazdir() {  // hosgeldinYazdir'in main method'u budur.
        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");// //stringYazdir methodu'nu cagırıyo
        // method'lar arasında gezebiliriz
    }

    private static void stringYazdir(String str) {  //stringYazdir methodu buradadır
        System.out.println(str); //string'i yazdır demektir,string'i de stringYazdir'dan getirdi
        //yani ekrana Boyle de olur yazdırcak
        kapanmaMethodu(); //kapanmaMethodu cagrısı yaptık
        //Bizi ustteki    private static void kapanmaMethodu();    ' na goturecek
        //method creation olusturmak zorunda degiliz ama buyuk projelerde method'suz isin icinden cıkamayız


    }
}

