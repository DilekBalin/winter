package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen hangi islemi yapmak istediginizi yaziniz * + - /");
        char islem = scan.next().charAt(0);
        System.out.println("Birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();

        hesapmakinesi(islem,sayi1,sayi2);


    }

    private static void hesapmakinesi(char islem, double sayi1, double sayi2) {


        if (islem== '*' || islem== '+' || islem== '-' || islem== '/'){


            switch (islem) {

                case '*':
                    System.out.println(sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
                    break;
                case '+':
                    System.out.println(sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println(sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
                    break;
                case '/':
                    System.out.println(sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
                    break;


            }



        }else System.out.println("Hatali giris yaptiniz");



    }
}
