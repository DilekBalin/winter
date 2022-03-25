package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";   //J birinci harf ama index'i sıfırıncı index

        System.out.println(str.substring (5));
        //Yukaridaki String!i kullanarak "Mehemt Hoca ile IT cok guzel" yazdıralım.
        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca"+str.substring(5));

        System.out.println(str.substring (9));//yazılan index inclusive

        //Eger bir index'ten sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek 2 prametre yazmak gerekir.
        //str.sunstring(baslangicIndexi,bitisikIndexi)
        //baslangıc indexi inclusive'dir ama bitisIndexi eclusive'dir

        System.out.println(str.substring(0,5)); //Java ve bosluk
        System.out.println(str.substring(0,1)); //J
        //0 dahil olacak ve 1'den sonraki de dahil olmayacak


        //Bana 6. karakteri String olarak bulun  //str.charAt(4);>>>> eskiden boyle arardık


        String harf= str.substring(5,6);  //5.harf dahil olacak,6.harf haric
        System.out.println(harf);

        str="Java"; // 4 tane harf vardir ,a'nin index'i icin sıfırdan baslariz
        //a 4.harftir ama index'i 3'tur.

        str= "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); //Java soldan calısmaya baslar ve
        // 7.index'i ilkin gorur ve 7 dahil der
        //Ancak sonra calısmaya devam eder 7'yi yine gorur ve haric der
        //dolayısıyla bize hiclik verir
        //Java balık hafızalıdır en son ne aldıysa hafızasına onu verir

        System.out.println(str);

        //System.out.println(str.substring(5,2)); //  HATA VERİR    5.karakterden basla 2 ' ye kadar
        //Boyle bir index yok cunku normalde %ten baslanıp 'ye gidilmez;
        //Bitis index'i baslangic index'inden kucuk olamaz
        System.out.println(str.substring(str.length()-1));  //Son harfi yazdırmak isteseydik   length ()-1 yazdırırdık

        //Son 5 harfi yazdıralim
        System.out.println(str.substring(str.length()-5));


        System.out.println(str.substring(str.length())); //son karakterden sonrası yok ama son harften sonraki kısmı
        //yani hiclik verir



    }
}
