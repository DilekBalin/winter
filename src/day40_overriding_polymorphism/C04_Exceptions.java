package day40_overriding_polymorphism;

public class C04_Exceptions {
    //String olarak verilen bir sayiyi integer'a cevirip iki katini ekrana yazdiralim

    public static void main(String[] args) {

        String str="1234a";
        //string'i integer'a cevirdik

        //Str icinde sayi olmayan bir karakter olursa
        //NumberFormatException: For input string: "1234a" verir  >> formatta sorun var ve string icine yazilandan kaynaklaniyor
        //Bu hatanin cozumu uzun bir istir ve Java buna bir cozum bulmustur
        // try catch kullanir



        try {
            int sayi=Integer.parseInt(str);  //problemin oldugu satiri getirdik sonra da yazdirmak istedigimiz (sout icindeki)sonucu getirecegiz
            System.out.println("Girilen sayinin iki kati =" + 2 * sayi);  //once bunu yapmaya calis
        } catch (Exception e) {  //eger bir exception ile karsilasirsan rapor ver
          //  e.printStackTrace();  //bunu yazmak zorunda degiliz istersek kendimiz de hatayi tanimlayabiliriz
            System.out.println("Girdiginiz String sayi olmayan elementler iceriyor"); //kendimiz yazdik
        }
    }
}
