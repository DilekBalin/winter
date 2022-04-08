package day38_nheritance_overriding;

public class Personel {
    public String statu = "Personel";
    public String haklar = "Tum personel esit haklara sahiptir";
    public String izin= "Tum  personel yilda 4 hafta izin kullanir";

    public void mesai() {
        System.out.println("Tum personel 5 gun,gunde 8 saat calisir");
    }

    public void maasHesapla() {
        System.out.println("tum personel haftada 30 gun * 8 saat *10 euro= " + (30 * 8 * 10) + "euro maas alir");
    }

}
