package day06_concattenation_operators;

public class C01_Concatenation {

    public static void main(String[] args) {

        String str1= "Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //Variable'lerin degerlerini degistirmeden
        //bu variab'leri kullanarak yazin

        System.out.println(str1+sayi1+str2);//Java5Guzel

        //2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);//2Guzel15
        //// paranteze gerek yok cunku once sayilari toplar
        //sonra metinle birlestirir
        //Java soldan saga ve yukarıdan asagı calstıgı ıcın


        //Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); //Java22

        //53Guzel
        System.out.println(""+sayi1+sayi2+str2);//53Guzel

        //Eger tamamen sayilardan olusan bir string varsa ve biz bunu Integer' cevirmek istersek
        //Integer.valueOf(str)

       // bir sayiyyi Stringe cevirmek istersek sayiyi bir hiclikle toplariz.
        //""sayi


    }
}
