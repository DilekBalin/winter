package day43_garbage_abstractClass;

public class C01_Final {


    final static double piSayisi = 3.14;  //static herkesin ulasmasi icin final ise en son deger icin
    final static String okulIsmi = "Yildiz Koleji";

    public static void main(String[] args) {


        final int sayi = 10;
        //sayi=20;  >>> kabul etmez cunku son degeri vermis olduk

        //okulIsmi="Java Koleji";  //calismaz cunku final olarak isaretlenmisti

    }

    public static final void method1() {  //final bir method olusturduk
        System.out.println("parent class final method1");
    }
}