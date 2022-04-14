package day42_exceptions;

public class C02_Castexception {
    public static void main(String[] args) {
        int sayi=10;
        //String str=sayi;  >>bu bir exception degil CTE'dir cunku cok net bir sekilde bu bir hatadir

        Object str3="Java cok guzel";
        String str4= (String) str3;
        System.out.println(str4);  //yazdirir cunku String,Object'in bir alt sinifidir

        Object sayi2=20;
        String str2= (String) sayi2;  //Daha genis olanin onune dar olani yazdik yani Explicit Narrowing
                                      //C02_Castexception.java:9)

        //Kisacasi bir datatyi casting yapilamayack bir dataya cevirmek istedigimizde ClassCastException verir ve Run Time Exception'dir.
    }
}
