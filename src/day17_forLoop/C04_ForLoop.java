package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {

        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <=29 ; i++) { //i 10'dan baslar saymaya 29 da dahil yazdırır
            System.out.print(i + ", "); // sayıyı tek satırda yazdırıp aralarına da virgul koymak istiyorum
        }
        System.out.println(30);   //bunu yapmamın sebebi 30 dan sonra da virgul koymasını engellemk
        //manuel yaptım  ve loop dısında yaptım ve bu kod static'tir



        int baslangic=15;
        int bitis=25;

        for (int i = baslangic; i <=bitis ; i++) { //kodu dinamık yaptık kullanıcı ne girerse ona gore calısır

            if (i<bitis){ //i bitisten kucukse
                System.out.print(i + ", "); // yazdır ve aralarına virgul koy

            } else{ //yani i degeri bitis degerine esit oldugunda
                System.out.println(i);
            }
        }
    }
}

