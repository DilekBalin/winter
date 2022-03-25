package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("Birşeyler yazınız");
        String input=scan.nextLine();

        int boslukVarmi=input.indexOf(' '); // bosluk yoksa -1

        if (!(boslukVarmi==-1)){
            System.out.println("bosluk var");

        }
        else{
            System.out.println("bosluk yok");
        }

        if (input.isEmpty()){
            System.out.println("yazı yoktur");

        } else {
            System.out.println("yazı vardır");
        }


    }

}
