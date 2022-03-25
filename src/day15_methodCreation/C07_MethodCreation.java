package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        String str ="Ali";

        // 'string'i yazdıralım' method'u olusturalım




        //1.Adim:
        // method adı yaz parantez koy
       // stringYazdir();


        //2.Adim
        //parantez icine variable'ın adını yaz
       // stringYazdir(str);


        //3.Adım:
        //methodun ustune gel create et
        stringYazdir(str);

        //hosgeldiniz diyen bir method olusturalım
        hosgeldinYazdir(); // icine bir arguman koymaya gerek yok


        //kapanma mesajı yazan bir method yazın
        kapanmaMethodu();






    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }



    private static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
    }




}
