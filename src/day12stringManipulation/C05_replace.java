package day12stringManipulation;

public class C05_replace {

    public static void main(String[] args) {


        String str ="Bugun ne cok sey ogrendik";

        //Bu cumlede bosluk dısındaki karakter sayısını bulunuz
        System.out.println("space haric karakter sayisi : " +  str.replace(" " , "").length());



        //atama yapılmadıgı surece orijinal String kalıcı olarak degismez
        //sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orijinal str karakter sayisi:"+str.length());
        //str'da kalıcı degisiklik yapalım
        //bugun yerine yarin
        //ogrendik yerine ogrenecegız

        str=str.replace("bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalıcı degisiklikten sonra:"+str);

        str.replace("ne cok","ne az");
        System.out.println(str);  //Atama yoksa kalıcı degisiklik de yok
        //tek tek harflerle ilgili bir degisiklik icin hepsini tek tek yapmalıyız


}
}