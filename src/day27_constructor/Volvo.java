package day27_constructor;

public class Volvo {
    String marka = "Volvo";
    String mensei = "Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot = otomatikPilotSorgusu();
    //otomatik pilot var olup olmadigina
    //elektrikli olup olmadigina gore karar verecegiz
    //elektrikli ise otomatikPilotSorgusu true, degilse false donecek
    //burda yapmak istedigimiz sey istersek bazi ozellikleri digerlerine gore hesaplayabilmek

    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
        //bu constructor'u manuel yaptigimiz icin default bir constructor yazmaliyiz

    }

public Volvo(){

}


    public int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }
    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if(elektrikliMi){
            sonuc=true;
        }
        return sonuc;
    }
    public String toString(){  //tum ozellikleri bir arada yazdirmak istedik
        String arabaOzellikleri= "Model : " + model +
                " Yakit : " + yakit +
                " Max Hiz : " +maxHiz;
        return arabaOzellikleri;


        /*Bu class'tan neler ogrendik
        ortak degerleri atayabiliriz
         */
    }
}


