package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun


        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");  //alt satıra gec


        // ayni soruyu while loop ile yapalim

        //while(baslangic<=bitis){
       // System.out.println(baslangic+"");   deseydik basa sarar dururdu
        //While loop kullanıyorsanız degiskeni artırmak ya da azaltmak gerekir
        //bunun icin sonuna //baslangic++; demeliydk
        //ancak bu loop bittiginde baslangic degeri istesek en son degeri yani 60' 1 ekleyerek verirdi
        //kullanıcın verdıgı baslangşc degeri aynı olmaz sorun olurdu baska sorular icin
        //bunun yerine int İ deyip


           int i=baslangic;
        while (i<=bitis){
            System.out.print(i + " ");
            i++;  // i'ye bagaldık burada
        }
        System.out.println("");
        System.out.println(baslangic); // 61
    }
}
