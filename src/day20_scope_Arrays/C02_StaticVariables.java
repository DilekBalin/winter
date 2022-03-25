package day20_scope_Arrays;

public class C02_StaticVariables {

   /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz
       Static variabler ise class variable olarak tanimlanir
       ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir
     */

    static String okulIsmi="Yildiz Koleji";  //Class'ın icinde ama main method'un dısında olustruduk
    static int okulNo;
    static  boolean okulAcikMi;




    public static void main(String[] args) {
      System.out.println(okulIsmi); //YildizKoleji
      System.out.println(okulNo); //0 //cunku okul numarasına bir atama yapılmamıs ve integerin default degeri 0
      okulNo=112;
      System.out.println(okulNo); //112 //cunku deger atadık ve herkesi ilgilendirdi
      System.out.println(okulAcikMi); //false  booleanın default degeri false

        staticMethod();  //method call bizi alır ve methoda goturur
      System.out.println(okulNo);
    }
public static void staticMethod(){
      okulNo=200; //degiskligi yazdırabiliyorum ve ekranda 200' u gormem icin cagırmalıyız
  //bunun icin main method'un icerisinde calısmasını istedigimiz methodun adını yazmalıyız 27.satırda yaptık

  System.out.println(okulNo);

  //Static variableler herkes icin degisir ve dgisiklik varsa tum classı takip ederiz



  } //buraya kadar gelen java tekrar method call'a doner

  //


}
