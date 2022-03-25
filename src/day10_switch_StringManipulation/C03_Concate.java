package day10_switch_StringManipulation;

public class C03_Concate {

    public static void main(String[] args) {
        String str1="Java";
        String str2= "Candir";

        //Java  Candir yazdiralım
        System.out.println(str1 + " "+ str2);
        String cumle= str1.concat( str2);
        cumle=str1.concat(" " ).concat(str2);
        System.out.println(cumle);

        //Concatenation yapmak icin ıkı ihtimalimiz var
        //İstersek daha once yaptıgımız gibi + opearatoru kullanabiliriz
        //Concate icine String degil de sayi ya da boolean bir deger yazsak ne olur?

        //cumle=str1.concat(5);   //kabul etmez
        //cumle=str1.conat(true);  //kabul etmez


        cumle=str1.concat(""+5);   // basına hiclık koyup String yaptık
        cumle=str1.concat(true+""); //sonuna hiclik koyup String yaptık

        //Concate method'u icine bir String parametre ister
        //String dısında bir data turu yazdıgınızda onu String haline getirmelisiniz












    }
}
