package groupWork.MethodForWhile;

public class Soru3 {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        int girilenSayi=839838;
        String girilenSayi1=String.valueOf(girilenSayi);
        int rakamlarToplami=0;
        int uzunluk=girilenSayi1.length();
        while (uzunluk>0){
            rakamlarToplami+=Character.getNumericValue(girilenSayi1.charAt(uzunluk-1));
            uzunluk--;

        }
        System.out.println(rakamlarToplami);

    }
}
