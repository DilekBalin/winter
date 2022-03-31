package groupWork.Arrays;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
          /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[8];


        for (int i=0;i<arr.length;i++){
            System.out.print(i+".indexi giriniz=");
            arr[i]=scanner.nextInt();

        }

   int bolunen=0;
        for (int i=0;i<arr.length;i++)
                if (arr[i]%3 == 0){

                    bolunen++;

        }
        System.out.println("3'e bolunen sayi: "+bolunen+" tanedir");

    }
}
