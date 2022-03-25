package ODEVLER;

import java.util.Scanner;

public class IfElseKanBagisi {
    public static void main(String[] args) {
        //Kullanicidan yasini ve kilosunu aliniz
        //18 yasindan kucukse kan bagisi yapamaz
        //18 yasindan buyuk ve 50 kilodan azsa kan bagisi yapamaz
        //18 yasindan buyuk ve 50 kilodan fazlaysa kan bagisi yapabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        if (yas <= 0 || yas > 120 ||kilo <= 0){
            System.out.println("Lutfen gecerli bir sayi giriniz");

    }else if (yas<18) {
            System.out.println("Kan bagisi yapamazsiniz");
        }else if(yas>18 && kilo<50){
            System.out.println("Kan bagisi yapamazsiniz");

        }else {
            System.out.println("Kan bagisi yapabilirsiniz");
    }
        }
}
