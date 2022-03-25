package day12stringManipulation;

public class C02_lastIndexOf {

    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        // Girilen kelime cumlede kullanilmamis.
        //Girilen kelime cumlede 1 kere kullanilmis.
        // Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java ogren,yeni bir program ile yeni bir sayfa ac";
        String kelime="yeni";
        int ilkKullanim=cumle.indexOf(kelime);
        int sonKullanim=cumle.lastIndexOf(kelime);  // Aramaya sondan baslıyor son kullanildigi index!in yerini bulur
        //Java!nin bir tane index'i vardır dolayısıyla index sondan da bastan da aransa hep aynidir

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");

        }else if (ilkKullanim== sonKullanim){

        }else {
            System.out.println("Girilen kelime cumlede birden fazla kullanilmis");
        }


        String str="Eclips";
        System.out.println(str.lastIndexOf("p",4));//4 bunu 4 dahil olarak algılamalıyız




    }
}
