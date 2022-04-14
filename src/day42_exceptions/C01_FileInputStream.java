package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu = "src/day41_exceptions/dosya";   //Eger bır dosyaya java'nin ulasmasini istiyorsak bir osya olusturmaliyiz
        //Bunu icin getirmek istedigimiz dosyayinin uzerine gelir >sag tusa basaruz > copy pat>path from content root kopyala >tirnak icinde yapistir


         /*
        Alti kirmizi cizgili olan her kod CTE degildir
        Java syntax hatalarini derleme esnasinda (compile) fark eder ve altini cizer
        biz bugune kadar tamamina CTE diyorduk
        ancak exception konusu ile birlikte Compile Time Exception kavrami da hayatimiza girdi
         */

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);  // FileInputStream  daha compile ederken burada bir hata olabilir diye bizi uyariyor
            int k = 0;                                             //exception firlatmamasi icin try catch yapariz
            while (((k = fis.read()) != -1)) { //fis her seferinde bir karakter okuyacak  -1 olmadigi surece yani okudugu karakter bir degerse bunu yazdiracak
                                              //Karakter kalmadiysa -1 donuyo ve while loop calismasi duruyor
                System.out.print((char) (k));
            }
        } catch (FileNotFoundException e) { //FileNotFoundException  //child
            e.printStackTrace();
        } catch (IOException e) {  //IOException  parent
            e.printStackTrace();
        }
/*
Exception'lar icin de parent-child iliskisi mevcuttur
eger bir kod icin birden fazla exception olusma ihtimali varsa:
oncelikle olasi exception'lar parent=child iliskisi tasiyor mu bakmamiz gerekir
Eger parent=child iliskis yoksa istedigimiz sirada catch cumlelelri olusturabiliriz

Eger parent =child iliskisi varsa
sadece parent exception'i yazabiliriz
veya ikisini de yazmak istersek child'i once parent'i sonra yazmaliyiz
cunku parent class'lar hatayi daha cok yakalar yani parent i yukaru koyarsak asagidaki child anlamsiz olur

//Kisacasi IOException hem buyuk hem de kucukk hatalari yakaladigi icin onu yazmamiz yeterlidir

 */




    }


}
