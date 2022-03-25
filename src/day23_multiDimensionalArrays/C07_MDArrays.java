package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {

        //kullanıcıdan bir cumle isteyin
        // ve cumledeki kelime sayısını yzdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();


        //Kelime sayısını bulmak icin space'leri syaabiliriz ama zahmetli olur
        //split yapacagız
        String arr[]=cumle.split(" "); //"" hiclik dersek harfleri buluruz " " space yaparsak kelimeleri buluruz
        System.out.println("Girdiginiz cumledeki kelime sayisi:"+arr.length);  //her fazladan boslugu da sayar


}

    }

