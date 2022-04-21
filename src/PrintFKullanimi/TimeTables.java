package PrintFKullanimi;

public class TimeTables {
    public static void main(String[] args) {
        /* Verilen sayi icin carpim tablosu olusturalim

        input:  5
        output: 1   2   3   4   5
                2   4   6   8   10
                3   6   9   12  15
                4   8   12  16  20
                5   10  15  20  25
         */

        int input=10;
        for (int i=1;i<=input;i++){
            for(int j=1; j<=input;j++){
                System.out.printf("%4d",i*j);

            }
            System.out.println();

        }
    }
}
