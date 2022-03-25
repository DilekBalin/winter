package day18_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
         /*
       A
       A B
       A B C
       A B C D
       A B C D E
       A B C D E F
       şeklini yazdırınız.
       */

       // A'nınASCII dehgeri =65'

        char input ='L';
        for (char i = 'A'; i <=input ; i++) { //A'dan baslayıp 1 artırarak inputa kadar gşdecegiz
            for (char j = 'A'; j <=i ; j++) { //A^dan baslasın i^ye  kadar gitsin  ucgen oldugu ıcın
                System.out.print(j + " ");
            }
            System.out.println("");  //her satırdan sonra alt satıra gecmezi icin
        }
    }
}
