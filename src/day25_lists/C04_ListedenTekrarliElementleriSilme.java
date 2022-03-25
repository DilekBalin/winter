package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {
    public static <list> void main(String[] args) {

        //Verilen bir listede tekrar eden sayilari sadece 1 kere yazdıran
        //bir method olusturun
        //ornek:[1, 3, 5, 3, 5, 6, 1, 7]
        //output [ 1, 3, 5, 6, 7]

        int arr[]={1, 3, 5, 3, 5, 6, 1, 7};
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        //Listeyi boyle tek tek ekleyeerek olusturduk array gibi olusturursak array gibi davranır

        tekrarsizListeOlustur(sayilar);  //method olusturduk

    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizList = new ArrayList<>();  //yeni bir liste olusturduk

        //for loop olusturdum listeyi gozden gecirmek icin
        int i;
        for (i = 0; i < sayilar.size(); i++) ;    //i 0.indexten baslayack ve sayılar listesninin size 'na kadar gidecek
        if (!tekrarsizList.contains(sayilar.get(i))) { //tekrarsız listemdeki index
            // sayilar listesindeki saydıgımız indexi yani i'yi icermiyorsa
            tekrarsizList.add(sayilar.get(i)); //buldugumuz elementi tekrarsizlar list'e ekleyecegiz

        }
    }
}