package day27_constructor;

public class Toyota {

    String marka = "Toyota";   //Marka arabadan arabaya degismeyecek   //sabit olanlara deger atadik
    int tekerAdedi = 4;
    boolean motoruVarMi = true;
    String model;     //sabit olmayanlara deger atamadik
    String yakit;
    int yil;
//bu variable'lar instance variablelardir yani class icinde olusturuldu

    public void maxHiz() {
        if (yakit.equals("Benzin")) {
            System.out.println("Benzinli araclar max 240 km hiz yapabilir.");
        } else if (yakit.equals("Dizel")) {
            System.out.println("Dizel araclar max 260 km hiz yapabilir");
        }

    }

    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla icin renk secenegi beyaz ve kirmizi ");
        }else if (model.equals("Yaris")){
            System.out.println("Yaris icin renk secenekleri sari ve lacivert");
        }
    }
}