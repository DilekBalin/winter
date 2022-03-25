package day17_forLoop;

public class C05_forLoop {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

        //if ve maculıs 'a ihtiyacımız var

        int sayi=57;
        for (int i = 1; i <=sayi ; i++) {  //1'den baslasın ve verilen sayıya kadar gitsin
            if (i%3==0){  //3' bolunuyorsa sayıları yazdır
                System.out.print(i + " ");
            }  //else ile işimiz olmadıgı icin kullanmadık
            // bagımsız bir if cumlesi kullandık isimiz 3 ilebolunebilenler ile
        }
    }
}
