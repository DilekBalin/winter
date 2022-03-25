package ODEVLER;

import java.util.Locale;
import java.util.Scanner;

public class SwitchDeveloper {
    public static void main(String[] args) {
        //soru3:
        //Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //Kullanici S girerse "Software"
        //D girerse "Developer"
        //E girerse "Engineer"
        //T girerse "Testing" yazdirin


Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasindaki harflerden birini giriniz");
        char harf= scanner.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'S':
                System.out.println("Software");
                break;

            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            default:
                System.out.println("Lutfen dogru harf girdiginizden emin olun");
        }





        }
}
