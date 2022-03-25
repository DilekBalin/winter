package ODEVLER;

import java.util.Scanner;

public class IndexOfOlmayanHarf {

    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir harf isteyin,harfin cumlede var olup olmadıgını yazın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        if(cumle.indexOf(harf) == -1){
            System.out.println("girdiginiz harf cumlede yoktur");
        } else{
            System.out.println("girdiginiz harf cumlede vardir");
        }
    }
}
