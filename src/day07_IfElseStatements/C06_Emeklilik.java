package day07_IfElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
// kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsiniz");

            // if else statement'larda iki durumdan sadece ve sadece biri calisir
            // ikisinin birden calisma ihtimali ====> YOK
            // ikisinin de calismama ihtimali =====> YOK

        }
    }
}
