package ODEVLER;

public class Odev_2 {
    public static void main(String[] args) {
        // task 1
        //byte veri tipinde bir degisken olusturun
        //short,int,float ve double data tiplrinde birer degisken olusturup adim adim widening yapin

        byte sayi= 24;
        System.out.println(sayi);//24

        short sayi1=sayi;
        System.out.println(sayi1);//24

        int sayi2=sayi1;
        System.out.println(sayi2);//24

        float sayi3=sayi2;
        System.out.println(sayi3);//24

        double sayi4=sayi3;
        System.out.println(sayi4);//24





        //task2
        //int veri turunde bir degısekn olusturun ve adim adim Narrowing yapin

        int sayi5=150;
        System.out.println(sayi5);//150

        short sayi6= (short)sayi5;
        System.out.println(sayi6);//150

        byte sayi7=(byte)sayi6;
        System.out.println(sayi7);//-106






        //task 3
        //Float data turunde bir variable olusturun ve yazdirin

        float sayi8= 1.2f;
        System.out.println(sayi8);//1.2


        //task 4
        // double255.36 sayisini int'a sonra da olusturdugunuz int sayiyi byte'e cevirip yazdirin
           double sayi9=255.36;
           System.out.println(sayi9);
           int sayi10=(int)(sayi9);//255
           System.out.println(sayi10);
            byte sayi11= (byte)sayi10; //-1





        //task 5
        //int 2 sayiyi birbirine boldurun ve yazdirin

        int sayi12= 460;
        int sayi13= 300;
        System.out.println(sayi11/sayi2);//1



        //task 6
        //int bir sayiyiy double bir sayiya bolun ve sonucu yazdirin
        int sayi14= 500;
        double sayi15= 255.36;
        System.out.println (sayi14/sayi15); //1.95


        //task 7
        //farkli data tipleri ie islem yapip sonuclarini yazdiralim
        byte num1=10;
        short num2=13;
        int num3=20;
        long num4=65;
        float num5= 1.5f;
        double num6=98.95;

        System.out.println(num1+num6); //989.5
        System.out.println(num4/num5); //43.333333
        //islemlerde Java buyuk olani kabul ediyo
        //ayni turde alıyorsak kendi turunu verir.


    }


}








