package socrativeCozum.socrativeMethodCreation;

public class Soru7 {
    public static void main(String[] args) {


        //Hangileri dogrudur?

      //A
        // public static void function(float i, int j);    //1.method
        // System.out.println("Good");
        //}


        //public static void function(double i, double j);      //2.method
        // System.out.println("Bad);
        //}

        // public static void main(String[] args) {    //Burası main method
         // function(1.2,3);  //ilk sayi double ikincisi int ,2.method'a uyar   ilkinde double int'e sıgmaz
        //}

        //Consol'da Bad yazdırır     //DOGRU





        //B
        // public static void function(float i, int j);   3.method
        // System.out.println("Good");
        //}


        //public static void function(double i, double j);
        // System.out.println("Bad);
        //}

        // public static void main(String[] args) {    //Burası main method
        // function(2,3);  //ikisi de integer,iki method'la da uyumlu ama ilkinde tek casting yaptıgı icin o calısır
        //}

        //Consol'da Good yazdırır  //DOGRU





        //C
        // public static void function(float i, int j);
        // System.out.println("Good");
        //}


        //public static void function(double i, double j);
        // System.out.println("Bad);
        //}

        // public static void main(String[] args) {    //Burası main method
        // function(2.1f,3.2); //ilk sayi float,ikincisi double ikinci method'la uyumlu sadece float icin casting yapar ve calısır
        //}

        //Consol'da Bad yazdırır   //DOGRU
       // CEVAP:A,B,C
    }
}
