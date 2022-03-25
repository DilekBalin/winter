package socrativeCozum.socrativeMethodCreation;

public class Soru3 {
    public static void main(String[] args) {

        //public static void add(int num1,int num2);
        //System.out.println(2+num1+num2);


        //public static void add (double num1,double num2);
        // System.out.println(3+num1+num1);

        //Verilen
        // Verile iki method aynı Class icindeyse hangisi yanlıs olur?



        //A
        // public static void main(String[] args) {
        // add(3,5);    //1.ile calısır cunku iki sayi da int
        //aslında ikinicisi de uyar casting yapar ama ilki daha optimum
        //}
        //consola 10 yazdırır    //DOGRU



        //B
        // public static void main(String[] args) {
        // add(3.1,5.2);    //2.si ile calısır cunku iki sayi da double
        //}
        //consola 11.3 yazdırır    //DOGRU



        //C
        // public static void main(String[] args) {
        // multiplay(3.1,5);    // ilki double,ikincisi int ama int ,double'a sıgar
        // 2.si ile uyumludur ve calısır cevap da 3+3.1+5.0=11.1 olur
        //}
        //Compile Time Error verir //YANLIS















    }
}
