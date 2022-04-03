package day34_AccessModifier_encapsulation;

public class C03 {
    //encapsule edecegimz 2 variable olusturalim

    private  int sayi;
    private String str;

    public int getSayi() {  //okuyo
        return sayi;
    }

    public void setSayi(int sayi) {  //yaziyor
        this.sayi = sayi;
    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                        ", str=" + str ;
    }



    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
