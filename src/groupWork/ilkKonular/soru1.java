package groupWork.ilkKonular;

import java.util.Locale;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

         /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mesleginizi qa/dev/ba/pm seklinde giriniz");
        String jobTitle = scan.next().trim().toLowerCase();  //trim basta ve sondaki boslukları yok eder
        //toLowerCase kullanıcının verdigi bilgiyi kucuk harfe ceviriyor


        if (jobTitle.equals("qa")) {
            System.out.println("mesleginiz:Quality Analyst");
        } else if (jobTitle.equals("dev")){
            System.out.println("mesleginiz:Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("mesleginiz:Business Analyst");
        } else if (jobTitle.equals("pm")) {
            System.out.println("mesleginiz:Project Manager");
        } else {
            System.out.println("hatalı giris");
        }
    }
}
