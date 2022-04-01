package day33_varrags_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {


        //Kac tane string verilirse verilsin iclerinden en uzun olani yazdiran bir method olusturun
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4="Samet";

        //Yazilana argument sayisi sabitse her zamanki gibi bir method olusturabilriz
        // ancak argumnet sayisinin degisme ihtimali varsa
        //o zaman varargs tercih edilir
        enUzunKelime(str1, str2, str3,str4);
    }

    private static void enUzunKelime(String... str) { //buray istedigimiz kadar String parametre gireriz
        String enUzunStr = "";
        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println("en uzun kelime= "+enUzunStr); //eger birden fazla esit uzunlukta kelimlerolsaydi ilkini alirdi
    }
}