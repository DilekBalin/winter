package ebruMeryemFikriyeDilekSoru;

public class soru3 {
    public static void main(String[] args) {
         /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */


        int galon=1000;
        double litres= galon*3.785;
        System.out.println(  galon+""+ "galon degeri:"+litres+""+  "litredir");

       int l=100;
       double g= l/3.785;
        System.out.println(l+"litre degeri"+g+"galondur");

        int f=35;
        double c= (f-32)*5/9;
        System.out.println("sicaklik:"+c);





    }



}
