package day14_halaStringManipulation;

public class C03_stringSayiToplama {
    public static void main(String[] args) {

       // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // "String str2 = “$10.55”
        //ipucu : Double.parseDouble() methodunu kullanabilirsiniz



        String str1="$13.99";
       String str2="$10.55"; //Bu haliyle yaparsak concat yapar o da toplama olmaz yan yana yazdırır
       //doouble'a cevirmeliyizbununn icin de dolar ve noktadan kurtulmalıyız

        str1=str1.replaceAll("\\D",""); // 1399  sayı olmayanları hiclik yaptık a  ma String olarak
        str2=str2.replaceAll("\\D",""); // 1055  butun sayı olmayanları hiclik yaptık String olarak

       //Hala String oldugu icin yan yana yazdirir
        //Sayıya cevirelim ve double yapalım

        double str1Sayi= Double.valueOf(str1);   //String olan bir seyi sayıya cevirdik
         double str2Sayi= Double.valueOf(str2);  //Double.parseDouble ile de yapabilirdik ynı sonuc cıkardı
        double sonuc= (str1Sayi+ str2Sayi)/100; // virgule geri donmek icin Boylece tekrar double'a dondurur
        System.out.println("verilen String sayilarin toplami : $" + sonuc );



    }
}
