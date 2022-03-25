package ebruMeryemFikriyeDilekSoru;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan=new Scanner (System.in);
        System.out.println("adinizi yazin");
        String ad=scan.nextLine();

        System.out.println("memleketinizi yazin");
        String memleket=scan.nextLine();

        System.out.println("su anki konumunuzu yaziniz");
        String konum=scan.nextLine();


        System.out.println("yasinizi girin");
        String yas=scan.nextLine();

        System.out.println("boyunuzu girin");
        String boy=scan.nextLine();

        System.out.print("yasadiginiz " + konum +" u seviyor musunuz? true/false");


        System.out.println("adiniz:"+ad);
        System.out.println("memleket:"+memleket);
        System.out.println("su anki konum:"+konum);
        System.out.println("yasiniz:"+yas);
        System.out.println("boyunuz:"+boy);












    }
}
