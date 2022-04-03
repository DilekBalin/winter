package review.day3;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        //Kullanicidan yasini alin
        //65 ten kucukse emekli olmamazsin
        //65 ten buyukse emekli olabilirsin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas=scanner.nextInt();

        if(yas<65){
            System.out.println("emekli olamazsiniz: ");

        }else if(yas>=65){
            System.out.println("emekli olabilirsin: ");
        }else System.out.println("hatali giris: ");
}}
