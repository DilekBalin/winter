package PrintFKullanimi;

public class MarketListesi {
    public static void main(String[] args) {
        String urun[]={"Domates","biber","patlican","elma","armut"};
        double brFiyat[]={2.3,2.29,4.1,2,3};
        double miktar[]={1,2,3.5,2.5,6};

        System.out.println("Urun       miktar  br_fiyat  urun_top");
        System.out.println("=====================================");
        for(int i =0; i<urun.length;i++){
            System.out.printf("%-8s %5.2fkg   £%5.2f    £%5.2f \n",urun[i],miktar[i],brFiyat[i],miktar[i]*brFiyat[i]);

        }
        System.out.println("=====================================");


        double toplamUrunMiktari=0;
        for(int i=0;i<miktar.length;i++){
            toplamUrunMiktari+=miktar[i];

        }
   double toplamOdenecekPara=0;
        for(int i=0;i<brFiyat.length;i++){
            toplamOdenecekPara+=brFiyat[i]*miktar[i];

        }
        System.out.printf("Genel toplam     %5.2fkg     %5.2f£",toplamUrunMiktari,toplamOdenecekPara);

    }
}
