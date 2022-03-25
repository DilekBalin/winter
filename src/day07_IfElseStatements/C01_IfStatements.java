package day07_IfElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {

            System.out.println("Verinlen sayilar esit");

            if (a > 100) ;

            System.out.println("a yuzden buyuk");

            if (a * b > 5) {
                System.out.println("sayilarin carpimi 5'ten buyuk");
            }

            // bagimsiz if cumlelelri kendileri disindaki kodlarla ilgilenemzler
            //bir sart ve o sarta bagli sonuca odaklidir.
            //birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi  gibi
            //hicbirisinin body'si calismaya da bilir.
        }
    }
}
