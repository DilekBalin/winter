package review.day2;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //yaricap iste
        //cemberin cevresi ve dairenin alani

        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen bir yaricap giriniz = ");
        double yaricap=scanner.nextDouble();

        double alan=3.14*yaricap*yaricap;
        System.out.println("dairenin alani =  " +alan);

        double cevre=2*3.14*yaricap;
        System.out.println("cemberin cevresi= "+ cevre);


        System.out.print("isminizi yaziniz: ");
        String isim = scanner.nextLine();
        char c=scanner.next().charAt(0);
        System.out.println("isminizin ilk harfi: " +c);
    }


}
