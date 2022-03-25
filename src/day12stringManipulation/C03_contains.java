package day12stringManipulation;

public class C03_contains {
    public static void main(String[] args) {


        // Soru 1)
        // Kullanicidan email adresini girmesini isteyin,
        // //mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // //@gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        // //@gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


        String email = "mulkiyeayboy@hotmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) { //boolean ifadeyi tersine cevirmek icin ! koyduk
            //basıdaki unlem 'icermiyorsa' anlamı verir
            System.out.println("lutfen gmail adresi yazin");

        } else if (email.lastIndexOf(arananMetin) == (email.length() - 10)) { //    @gmail.com'un uzunlugu 10 oldugu icin
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }

    }

}



