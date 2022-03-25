package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu= true;
       //String str=dogruMU;//sol String,sag boolean olunca kabul etmiyor

        byte sayi1=44;
        System.out.println(sayi1);//44

        short sayi2=sayi1;// esitligin solu short,sayi ise byte oldugu halde Java itiraz etmiyor.
        //cunku ikisi de sayi
        //deger olarak atanan data turu variable olan data turunden kucuk oldugu icin Java sorun yapmaz
        //buna da autowidining olarak yapar

        double sayi3= sayi2;
        System.out.println(sayi3);




    }
}
