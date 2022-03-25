package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {


         // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String kelime=scan.next();
        String tersKelime="";

        //3 ihtimal var ve if else yaparız

        if (kelime.length()<3){ //uzunluk 3'ten kucukse
            System.out.println("kelime cok kisa");
        }else if (kelime.length()<=5){ //zaten 1.iften gectigi icin buraya gelir
            //5'e esit ve kucuk olanlar 4 ve 3 'tur
            //3'ten kucuk olamaz dedik ilk if'te eger 3 'ten kucuk olsaydı bu body'e gelemezdi



            if (kelime.length()==3){ //kelime uzunlugu 3 ise
                //3,4 ve 5 sayılari icin ayrı bir if else actık cunku onları tek tek yazdırmalıyız
                //ters String'i if'ten once yazmalıyız ki burda tanısın
                tersKelime=kelime.substring(2)+ //3.harf
                        kelime.substring(1,2)+  //2.harf
                        kelime.substring(0,1);  //1.harf

            }else if(kelime.length()==4){ // kelime uzunlugu 4 ise
                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }else { //uzunluk 5 harfli ise
                tersKelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length()); //kelime.length () demek harf sayısı demektir
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);
        } else {
            System.out.println("kelime cok uzun");// en bastaki if2in else'dir cunku ilkinde 3'ten kucukse cok kısa
            //bu else en bastaki if'in else'dir
            //ilk if'te kelime kısadir bu else de kelime cok uzun yazdırdık
            //aradaki if ve else 'ler3,4 ve 5 icin olusturdugumuz sartlardı
        }



    }
}
