package day37_inheritance;

import day36_Inheritance.Parent;

public class Child extends Parent {
    //bir class'i child class yaptigimizda
    //parent class'taki constructor'a ulasmasi gerekir
    //bu durumda parent class'taki constructor'in
    //access modofier'i uygun bir modofoer yapilmalidir



    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }

    Child (int s ){
        //Child class'taki tum constructor'larin ilk satirina
        //Java'nin yerlestirdigi constructor parametresiz yani super
        super();
        System.out.println("Child class parametreli constructor");
    }

    Child (int sayi1, int sayi2){
        //eger parent class'tan parametresiz constructor'u degil de
        // baska bir constructor'u calistirmak isterseniz
        //bunu Child class'taki constructor'un ilk satirina yazmalisniz
        super(sayi1,sayi2);
        System.out.println("Iki parametreli constructor");
    }
    public static void main(String[] args) {

        Child child =new Child(5,8);
    }
}
