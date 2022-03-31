package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
       /*/Java Pass By Value bir proglammlama dilidir
       yani bir primitive variable 'i argument olarak bir methoda yollarsanzi
       Java o variabl'i degil degerini (value) method'a aktarir (pass)
        */

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);  //etiket fiyatini asagidaki methoda goturuken sadece value'yu goturuyor
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method'ta etiket fiyati: "+ etiketFiyati); //100.0


    }

    public static void yuzdeOnIndirimYap(double x) {   //burdaki ismin hicbir onemi yok yani burdaki variable yukaridaki variable ile ayni degildir
                                                        //yani bu local bir variable dir  //eger ayni olmasinini istiyorsaniz class level'da olusturmalisiniz
        x=x*0.90;
        System.out.println("sizin icin indirimli fiyatimiz: "+ x);  //90.0
    }
}
