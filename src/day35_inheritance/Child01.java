package day35_inheritance;

public class Child01 extends Parent{  //extends ve parent classi yazdik

    public static void main(String[] args) {
        /*
        Child class hicbir objeye ihtiyac duymadan
        parent class'taki variable ve method'lara ulasabilir
         */

        System.out.println(isim);//Neval
        //normalde isim variable burda yok
        //eger bir class'ta extends kelimesi varsa

        System.out.println(fabrika);//protected oldugu halde child ulasabildi
        method1();
        method2();

        //Parent objParent=new Parent();//hangi classi kullanmk istiyorsak o classtan obje olustururduk
    }
}
