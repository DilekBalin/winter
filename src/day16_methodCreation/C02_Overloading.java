package day16_methodCreation;

public class C02_Overloading {
    public static void main(String[] args) {


String str="Bu da gecer ya Huu";
        System.out.println(str.indexOf("d")); //3   //d 3.index'te
        System.out.println(str.indexOf("a",5)); // iki parametresi var //5.index'ten sonra a arayacak //13
        //5.index'ten sonra a aradı ve 13.index'te a yı buldu

       // System.out.println(str.substring('a',5));  // calısmadı cunku ilkinin char degil String olması gerek
        //ikincisi de integer olmalı

        //Bir class'ta birden fazla method olmasına overloading denir
        //bazı kurallar olmalı
        //ya parametre sayısı farklı olmalı
        //parametre sayısı aynı ise argumnetlerin data turleri farklı olmalı

        System.out.println(str.indexOf('a',5)); //  13  // bunun da iki tane parametresi var
          System.out.println(str.indexOf("a",5)); //13 // bunun da iki tane parametresi var
        //ama ikisinin ilk index'lerindeki data turleri farklı oldugu icin (biri String biri char)iki farkli method olabiliyor







    }
}
