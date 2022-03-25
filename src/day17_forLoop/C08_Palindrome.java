package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {


        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.

        String input= "Mada";   //method'la yapcaz
        //void olsun sonucu bize dondurmesin
        palindromeKontrolEt(input);  //methoda input'u yollamalıyım ki kontrol etsin

        //Method sayesinde kodum hem cok acık hem de clear
    }




    private static void palindromeKontrolEt(String input) {   //ry
        String terstenInput=""; //palindrome olup olmadıgı kontrol etmek istedik ve hiclik degerini attık

        for (int i = input.length()-1; i >=0 ; i--) {  //bu is dinamik olsun diye for loop yaptık
            // ve sondan baslayıp son harfi alıp terstenInput'a ekleyecek
            //0.index' kadar devam etmeli
            //sondan basa geldigi icin --

            terstenInput+=input.charAt(i); //terstenInput' bu i. index'teki charı eklicez
        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){ //tersten de aynıysa buyuk kucuk harfe dikkat etme
            System.out.println("Girdiginiz kelime palindrome");  // yazdır

        } else {
            System.out.println("girdiginiz kelime palindrome degil"); //terstenInput ile input esit degilse
        }//return type yapmadık dondurmesini istemedigimiz icin
    }
}
