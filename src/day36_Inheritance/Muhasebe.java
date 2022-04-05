package day36_Inheritance;

public class Muhasebe extends Personel {    //muhasebe child personel ise parent class

    //parent class diger adi super classs
    //child class diger ismi sub class

        protected int saatUcreti;
        protected String statu;
        protected int maas=8;


        protected int maasHesapla(){
                int maas=saatUcreti*8*30;
                return maas;
        }


        }
