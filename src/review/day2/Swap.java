package review.day2;

public class Swap {
    public static void main(String[] args) {

        //verilen sayi 1 ve sayi 2 degerlerini 3.olmadan yer degistirin

        int sayi1 = 15;
        int sayi2 = 20;

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        System.out.println("sayi2= "+ sayi2);

        sayi1 = sayi1 - sayi2;
        System.out.println("sayi1= "+sayi1);

        System.out.println("sayi1= "+sayi1 + "-"+ "sayi2= " + sayi2);


    }

}
