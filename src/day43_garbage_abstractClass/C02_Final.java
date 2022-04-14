package day43_garbage_abstractClass;

public class C02_Final extends C01_Final {   //Child olsa bile final degistirilemez


   //public void abstractMethod();//Bodysi olmayan bir methodu kabul etmez



    public static void main(String[] args) {
        System.out.println(C01_Final.okulIsmi);  //static variable'lara baska class'lardan class ismi. ile ulasabiliyoruz

        //C01_Final.okulIsmi="Java Koleji";  ///Kabul etmez cunku o variable final olarak isaretlenmisti
    }

   // public static final void method1() {
     // System.out.println("parent class final method1");

        /*
        Override parent class'taki method'u child class' uyarlamak demekti
       yani islevini degistirmek istiyoruz
       ancak parent class'taki method final olarak tanimlandigindan
       Java method'un uyarlanmasina izin vermiyor

       Degeri  degistirilmeyeck variable icin constant kelimesi kullanilir


       Final Variable>>>>> constant variable
       Final Methods>>>>> Override edilmeyecek method
       Final Class>>>>>> Inherit edilmeyecek class

         */



    }

