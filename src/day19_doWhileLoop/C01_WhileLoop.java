package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın
        //bu sayıyı tam bolen sayıları ve toplam kac tane olduklarını ekranda yazdırın

        //bunu for loop ile de yapabılırız cunku sayıya gore girilen sayma miktari belli
        //ancak while loop ile yapacagız


        int input = 20; //kullanıcıdan bir sayı aldık ve islem yapacagımız variable'ları looptan once yapmalıyız

        int bolen = 1;
        int sayac = 0;


        while (bolen <= input) { // 1Den baslayack ve kullanıcın girddigi sayıya kadar devam edecek

            if (input%bolen==0){//girilen sayı bolene tam bolunebiliyor
                System.out.print(bolen+" ");
           sayac++; //1 tane buldum ya sayacı bir artırmam lazım


            }
        bolen++; //eger while loop bitmede boleni bir artırmazsak saonsuz donguye girer cunku bir sonraki sayıya gecemez
            // eger artırmasak her seferinde kalan 1 olur ve sonsu dongu olur
            //ayrıca bolmeyen bir sayı oldugunda islemi basa alır ve biz boolean ++ demezsek hep aynı soruyu goturur

        }
        System.out.println("");//alt satıra gecmek icin
        System.out.print(input+"sayısını bolen "+sayac+ "adet sayı vardır");


    }
}