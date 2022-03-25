package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)


        //10'dan kucuk ıstememizin sebebi integer sınırında klamasını saglama
        //her carpımdan sonra bunu ihtiyacımız olan bir konteynıra koymak lazım
        //loop baslamdan once bir konteynır ve deger atamak lzaım



        int input = 9;
        int faktoryel=1; //0 alamayız toplama olsa sıfır alırdık
        //aslında burada bir faktoriyel konteynırı olusturduk ve ilk input*1 diyecek
        //ikincş şnput*mevcut sonuc
        //ucuncu input*mevcut sonuc
        //yani kısacası faktoriyel yaptık:9*1=9  9*8=72  7*72=502....dşye devam eder
        String faktoryelAcikYazim=""; //String oldugu icin hiclik degrri atadık int string yapmak icin yaptık

        for (int i = input; i >=1 ; i--) { //normalde carpmada asagıdan veya yukarıdan baslamamnın bir farkı yok
            faktoryel *=i;   //  9 verecekl for loop ,9 ile 1 carpacak faktoriyel verecek
            //sonra 8 verecek 8 ile 1'i carpacak faktoriyel verecek
            //sonra 7 vercek 7 ile 1'i carpacak faktoriyel verecek
            //inputtan baslayıp i >= 1 olana kadar devam edecegiz bu isleme


            if (i==input){   // yani i esittir girilen sayi yani 9 a esitse alttakini yazdir
                faktoryelAcikYazim =faktoryelAcikYazim + i ; //bosluk+sayılan sayı
            } else
                faktoryelAcikYazim =faktoryelAcikYazim +  "*" + i ; //degilse bunu ekleyecegiz yani
            //bosluk+ * + girilen sayı
        }


        System.out.println(input+"! = " + faktoryelAcikYazim + " =" + faktoryel);
        //dısında yaptık
        //loopun icinde yaparsak her seyi sırayla yazdırır yani
        //i 9 iken 9!,8 iken 8!,7 iken 7!...bu da uzun ve kirli bir goruntu olur
        //bu da uzun sayılar icin goruntu kirliligi demek


        //kısacası ozetlersek
        //9 faktoriyel icin bi sey yazmammıza gerek yok cunku 9 inputtan geliyor ve
        //input+"!=" demek yeterli oldu
        //devamında 9*8*7*6*5*4*3*2*1 yazdırmak icin de if body'si icine  //lppo 9dan geriye devam
        //ediyordu ve seferinde buraya bir sey yazdırmam lazım
        //9 ken 9'u,8ken 8!i,7 ken 7'yi..eklemem lazım
        //loopun icerisinde if bodysi ile sadece 9 ken sayıyı yazdırdım yani 9
        //bunun dısındakiler icin de once 8 oldu sırayla 8*7*6* olacak sekilde else body si actık

    }
}
