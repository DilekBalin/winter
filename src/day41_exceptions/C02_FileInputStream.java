package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args){

        /*
        bir kod yazilirkenn olasi exceptionlar ongorulup ona gore
        exception olustugunda Java'nin ne yapmasi gerektig belirtilmelidir.

        1 - eger exception olustugunda coduk calismaya devam etmesini istemiyorsak
        method isminin yanina olusabilecek exception'u declare edebiliriz
        2 -Eger exception olussa da kodun calismaya devam etmesini istiyorsak
        sorun olusturabilecek codu try catch bloguynun icine alir
        catch bloguna olusabilecek exception'i ve olasi exception durumunda Java'nin ne yapmasini istedigimizi yazabiliriz.

         */
        String dosyaYolu="src/day41_exceptions/dosya";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);   //Java tedbir almamizi istiyor cunku aradigini bulamayabilir
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
