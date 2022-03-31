package day29_staticKeyword;

public class C04 {
    public static void main(String[] args) {
  for (int i=0; i<3;i++){  // i=1 iken 0 dan 9'a kadar method call yapacagiz
      C03.artirma();   //java class 3 e gidecek ve sayiyi bir artiracak degeri 6 olacak
      //basa donecek ve for loop oldugu icin sayi i=2 iken java 3 class'ina gidecek ve sayiyi bir artiracak sayi 7
      //bu islemi 10 kez yapacak ve en son sayi 15 olacak
      //ve hepsini sitayla yazdircak consola
      //calisma duruncaya kadar static uzeribde uyapilan herbir degiisklik devam eder
      //Bu classta artik sayimizin degeri 15 tir ancak baska bir classta ilk defa yazdirirsam bastan baslar

      C05.eksiltme();   //C05'teki eksiltme methodunu cagiriyorum
  }

        System.out.println(C03.sayi);


    }}