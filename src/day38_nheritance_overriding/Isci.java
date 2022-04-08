package day38_nheritance_overriding;

public class Isci extends Personel {



    public String statu = "Isci";
    public String haklar = "Isciler kidem tazminati alirlar";
    public String ikramiye = "Isciler yilda bir ikramiye alir";
    public void mesai() {
        System.out.println("Tum isciler haftalik 40 saat calisir");
    }

    public void maasHesapla() {
        System.out.println("tum isciler haftada 30 gun * 8 saat *11 euro= " + (30 * 8 * 11) + "euro maas alir");
    }
}
