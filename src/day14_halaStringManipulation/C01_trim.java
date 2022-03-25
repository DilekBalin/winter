package day14_halaStringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str= "   Siz ne derseniz deyin,  Java bildigini okur   " ;


        str.trim();
        //tek method oldugu icin parametre kullanmaya gerek yok
        System.out.println(str);//atama yapmadıgımız icin bosluklari silmeden yazdirir
        System.out.println(str.length()); // 49 cunku atama yapmadigimiz icin bosluklar da sayildi

        //kalıcı olarak bosluklardan kurtulmak icin
        str=str.trim();   //deger atadıgımız icin kalıcı olarak degistirdi
        System.out.println(str); // bosluksuz yazdirdi
        System.out.println(str.length()); // 43




     }
}
