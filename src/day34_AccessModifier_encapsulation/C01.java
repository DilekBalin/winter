package day34_AccessModifier_encapsulation;

public class C01 {

        private static int sayi=10;
        private static String str="Java";
        static int acikSayi=20;
        String acikString ="Hi";//Access modifier'i default access modifier olur

    public static int halkaAcikSayi=15;
    protected static int aileyeOzel=40;

     protected   C01(){
            //bu constructor'un access modifier'i default access modifier'dir
           // dolayisiyla icinde oldugumuz paketin disinda bu class'tan obje olusturulamz'
        }

       private C01(int numara){
            System.out.println("parametreli conctructor calisti");
        }

      private void method1(){

      }



    }


