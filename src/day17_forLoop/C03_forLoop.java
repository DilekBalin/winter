package day17_forLoop;

public class C03_forLoop {
    public static void main(String[] args) {



        //Ekrana 10 kez "Java Guzeldir" yazdırın

     /*   System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");
        System.out.println("Java Guzeldir");


        //eskiden olsa boyle cozerdik ama goruntu hic hos degil

    */
//bunun yerine benim yerime 1'den 10' a kadar yazdıracak bir for loop olusturacagız

        for (int i = 1; i <=10;i++){ //  //i 1'den baslasın ve 10'a kadar gitsin
            //i bizim sayacımızdır
            // intelliji i=0 'dan baslar dikkat etmezsek sayi 1 artar
            System.out.println(i+ " "+"-Java Guzeldir");
        }
        for (int i=1; i<=40; i++){
            System.out.print(+ i +" "); //i'den sonra + bosluk dedik ve
            // tırnagın arası da bir karakter bos oldu boylece yan yana ama ayrı ayrı yazdı
        }


    }
}
