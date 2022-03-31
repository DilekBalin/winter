package day30_passByValue;

public class C01_StaticBlocks {
    static{
        System.out.println("Static 1 block calisti");
    }


    C01_StaticBlocks(){ //class calismaya baslamadan yapmmaiz gereken on atamalar varsa onlari yapar
        //sttaic block class ilk calismaya basladiginda devreye girer
        //ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        //yazildigi satirin hicbir onemi yoktur
        //class icerisinde istene yerde yazilir
        //static block birden fazla olursa bloklar yukaridan asagi dogru sirayla calisir
        System.out.println("Constructor calisti");   //obje olustrumasaydik calismazdi
    }

static {
    System.out.println("Static 2 calisti");
}

public static void main(String[] args) {
    System.out.println("Main method baslangici");
    C01_StaticBlocks obj1;  //obje olustruduk ama constructor cagirmadik
    new C01_StaticBlocks();   //constructor parantezini nerede gorursek orada calisir
    System.out.println("Main method sonu");
}


}
