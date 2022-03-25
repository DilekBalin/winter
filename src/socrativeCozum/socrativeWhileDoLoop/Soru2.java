package socrativeCozum.socrativeWhileDoLoop;

public class Soru2 {
    public static void main(String[] args) {
        int num = 1;  //num 1 adlı variablımız var
        while (num < 1) {   //1 den kucuk oldugu icin false verecek
            System.out.print(num + " ");
            num++;

            //Program calısır yani whileloop calıısr ama loop body si devreye girmez ama ekranda hicbir sey yazdırmaz
        }
    }
}