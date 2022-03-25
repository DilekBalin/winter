package ODEVLER;

import java.util.Locale;
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        // TASK 1:
        // kullanicidan gun isimlerinden birinin ilk harfini isteyin
        // ve o harfle baslayan gun isimlerini yazdirin

        //Ornek:ilkHarf=P output="Pazar,Pazartesi veya Peersembe"
        //ilkHarf=S output="Sali"


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun isimlerinden birinin ilk harfini yaziniz");
        char i = scan.next().toLowerCase().charAt(0);

        if (i == 'p') {
            System.out.println("pazar,pazartesi,persembe");
        }

        if (i == 's') {
            System.out.println("sali");
        }


        if (i =='c') {
            System.out.println("carsamba,cuma,cumartesi");
        }


        //TASK2:
        //Kullanicidan gun ismini alın ve hafta ici veya hafta sonu oldugunu yazdirin
        //Ornek gun:Pazar:"output= "Hafta sonu


        System.out.println("lutfen gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")|| gunIsmi.equals("carsamba")
                || gunIsmi.equals("persembe")|| gunIsmi.equals("cuma")){
            System.out.println(" girdiginiz gun hafta ici");
        }

        if (gunIsmi.equals("cumartesi")|| gunIsmi.equals("pazar")){
              System.out.println("girdiginiz gun hafta sonu ");
          }



        //TASK3
        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        // ve dikdortgenin kare olup olmadigini yazin

        System.out.println("Lutfen dikdortgenin uzun kenarini yaziniz");
        int kenar1=scan.nextInt();

        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");
        int kenar2=scan.nextInt();

        if( kenar1 == kenar2 ) {
            System.out.println("verdiginiz sayilar bir kareye aittir");
        }

        if (kenar1!=kenar2) {
            System.out.println("verdiginiz sayilar bir dikdortgene aittir");

        }




        //TASK4:
        //Kullanicidan bir gun adi alin eger gun Cuma ise ekrana "Muslumanlar icin kutsal gun" yazdirin
        //Cumartesi ise ekrana "Yahudiler icin kutsal gun"yazdirin
        //Pazar ise ekrana "Hristiyanlar icin kutsal gun" yazdirin

        System.out.println("Lutfen bir gun adi yazin");
        String gunAdi=scan.next().toLowerCase();


        if (gunAdi.equals ("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }

        if(gunAdi.equals ("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }

        if(gunAdi.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }





    }

}
