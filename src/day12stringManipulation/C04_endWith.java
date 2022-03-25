package day12stringManipulation;

public class C04_endWith {
    public static void main(String[] args) {

// Soru 1)
        // Kullanicidan email adresini girmesini isteyin,
        // //mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // //@gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        // //@gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


        String email = "mulkiyeayboy@hotmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){ // email arananMetin'i icermiyorsa
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(email.endsWith(arananMetin)){
            System.out.println("Emailadresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }
    }

}
