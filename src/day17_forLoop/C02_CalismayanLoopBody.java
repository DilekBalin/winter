package day17_forLoop;

public class C02_CalismayanLoopBody {
    public static void main(String[] args) {


        for (int i = 0; i >10; i++) {  //i'nin baslangıc degeri 0 ancak i>10 dediginde false verir
            //false gordugu yerde broken olur ve baslamadan bitmis olur
            //loop calısmadı demiyoruz
            System.out.println(i);//loop body'si baslayamadan sona erer.
        }

        System.out.println("baslaangıc degeri bitis kosulunu saglamadıgından\n"+
                "loop body'si hic calısamadan loop sona erdi");

        //ending Condition hep true verirse sonsuz donguye girer
        //Ending Condition hic true olmazsa loop body hic devreye girmez
    }


}
