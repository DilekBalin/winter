package groupWork.ilkKonular;

public class Soru8 {
    public static void main(String[] args) {
            /*
        1
        2 2
        1 1 1
        2 2 2 2
        1 1 1 1 1
         */
        int n=5;
        for (int i = 1;  i <=n; i++ ) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
