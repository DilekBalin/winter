package ebruMeryemFikriyeDilekSoru;

public class soru28 {
    public static void main(String[] args) {

//Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
// Girilen kelime cumlede kullanilmamis.
// Girilen kelime cumlede 1 kere kullanilmis.
// Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle = "Agustosta dordumuz is sahibi olduk mu olduk";
        String kelime = "olduk";


        int ilkKullanim = cumle.indexOf(kelime);//Kelime cumlenin icinde
        int ikinciKullanim = cumle.indexOf(kelime, ilkKullanim + 1); //once aranacak kelime yazdık
        // sonra da ilk kullanima 1 ekleyip ilk kullanımdan itibaren kac kez kullanılmıs ona baktık


        if (ilkKullanim == -1) {     //cunku ikinci kullanim -1 e esitse demek ki ikinci kullanim yok
            System.out.println("kelime cumlede kullanilmamistir");
        } else if (ikinciKullanim == -1) {
            System.out.println("Kelime 1 kez kullanilmistir");
        } else {
            System.out.println("Kelime birden cok kez kullanilmistir");
        }


    }
}
