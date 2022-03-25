package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *      5-i olacak
         * * *        4-i
         * *          3-i
         *            2-i
         */
        int input = 5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <=input-1 ; i++) {
            for (int j = 1; j <=input-i ; j++) {  //yani 5-1 yani 4 yıldız
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
