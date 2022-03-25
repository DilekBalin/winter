package groupWork.ilkKonular;

public class Soru9 {
    public static void main(String[] args) {
        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */



        int sayi=-5;
        if (sayi>=0) {
            if (sayi < 10) {
                System.out.println("rakam");
            } else {
                System.out.println("pozitif sayi");
            }
        }else{
                System.out.println("negatif sayi");
            }
        }



}
