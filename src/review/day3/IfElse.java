package review.day3;

import java.util.Scanner;

public class IfElse {
    //Kullanicidan bir karakter girmesini isteyin
    //karakterin harf olup olmadigin kontrol edin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char c=scanner.next().charAt(0);

        if (c>='a'&&c<='z'||c>='A'&&c<='Z'){
            System.out.println("harftir");

        }else System.out.println("harf degildir");
    }

}
