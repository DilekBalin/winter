package day20_scope_Arrays;

public class C03_LocalVariable {
    public static void main(String[] args) {


        int sayi =0 ;
        for (int i = 0; i<10;i++) {
            System.out.println( sayi); //deger atamzasak local variablelera java default atamadıgı icin bunu yazdıramayız

        }

        //loppta kullanacagımız variablelari onceden olusturmazsak hata verir cunku java local variablara default atamaz
    }

}
