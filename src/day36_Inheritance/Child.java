package day36_Inheritance;

public class Child extends Parent{
    Child(){

        super();
        System.out.println("Child Cons. calisti");
    }

    //Tum class'larda biz gormesek bile java'nin olusturdugu default conctructor vardir
    //Extends keyword kullanan class'lardaki tum constructor'larin ilk satirinida biz gormesek bile
    //super ()    constructor vardir.
    //yani parent class'in parametresiz constructor'i diyebiliriz
    public static void main(String[] args) {

        Child child = new Child();
    }


}


