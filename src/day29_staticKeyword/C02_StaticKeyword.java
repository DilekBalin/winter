package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        //baska class taki static class uyelerine ulasabilmek icin sadece
        //classIsmi.staticUyeIsmi

        System.out.println(C01_Static.okulTelefonu);   //Class ismi ve uyesi
        C01_Static.okulTelefonu="3125474747";
        System.out.println(C01_Static.okulTelefonu);  //3125474747   okkul nosunu degigtirdik ve
        // kalici oldu
        //durana kadar gecerlidir
        //buyuk projelerde en son hangi degisiklik yapildiysa o kalir

        //Baska classtaki sttaic olmayan class uyelerine
        //ancak o class'tan obje olusturarark ulasabiliriz.
        //ve obje ile yapilan  atamalar sadece o obje icin gecerli olur

        C01_Static obj1= new C01_Static();    //Obje olusturduk
        C01_Static obj2= new C01_Static();
        System.out.println(obj2.okulIsmi);  //Yildiz Koleji

        obj2.okulIsmi="Sabir Koleji"; //obj 2'nin ismini degistirdik
        System.out.println(obj1.okulIsmi);//Yildiz Koleji obj 1 de herhangi br degisiklik yok



    }


}
