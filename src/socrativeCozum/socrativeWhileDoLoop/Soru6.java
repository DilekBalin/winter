package socrativeCozum.socrativeWhileDoLoop;

public class Soru6 {
    public static void main(String[] args) {
        char ch = 'a';
        while (ch < 'd') {
            System.out.println(ch +" ");  //a yazdır bosluk alta gecer
       ch++;//sırayla devam eder  // a b c
            //ekran cıktısı asagıdakilerden hangisi ile aynıdır?
        }

  //  A)
    for(char i='a';i<'d';i++){
        System.out.print(i+ " "); // a b c
        //Not :cift tırnakların icinde bir karakter bosluk vardır

        /*
        B)
          System.out.print('a'+'b'+'c');
          Not: a b c harflerinden sonra tek tırnagın icinde bir karakter bosluk vardır
          //Char bir ifadede hem karakter hem bosluk olmaz bu sık hata verir
          //bosluk olmasaydı charlari yan yan atolamak demek ascii degerlerini  almak demektir ve sayısal bir sonuc verirdi //294

          C)
          System.out.print('a'+" " +'b'+" "+'c'+" ");
          Not: Cift tırnakların icinde bir karakter bosluk vardır
          // a b c


           D)
          System.out.print('a'+'b'+'c');   //294



         Cevap:A ve C dogru
         */
    }









    }



}