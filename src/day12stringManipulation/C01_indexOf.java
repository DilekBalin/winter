package day12stringManipulation;

public class C01_indexOf {


    public static void main(String[] args) {



       // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        // Girilen kelime cumlede kullanilmamis.
           //Girilen kelime cumlede 1 kere kullanilmis.
        // Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java ogren,yeni bir program ile yeni bir sayfa ac";
        String kelime="yeni";
        int ilkKullanim=cumle.indexOf(kelime);          //Cumlenin icerinde kelime yoksa -1 dondurur
                                                        // ya - 1 cıikar ya da index cikar
                                                        //eger -1 ise hic kuullanilmamistir

        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1); // //ilk once aranan kelime ve sonra virgul
        // ilk kullanim olmasa bile + 1 ile toplayacak



        if(ilkKullanim==(-1)){
        System.out.println("Girilen kelime cumlede kullanilmamis");


        }else if (ikinciKullanim==(-1)){ //cumlede kesin var oldugu icin bunu kullandik
            //boyle ararsak 1 tane var demek
            System.out.println("istenen kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("Girilen kelime cumlede birden cok kullanilmis");
        }



    }


}
