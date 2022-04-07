package day36_inheritance;

public class Muhasebe extends Personel {    //muhasebe child personel ise parent class

        //muhasebe class'nda kisisel bilgilerle ilgil veri girmeye gerek yok onlar personel'de var

    //parent class diger adi super classs
    //child class diger ismi sub class

        protected int saatUcreti;
        protected String statu;
        protected int maas=8;//asgari ucret girdik ve hicbir deger atamask bile bunu kullanir


        protected int maasHesapla(){
                int maas=saatUcreti*8*30;
                return maas;
        }


        }
