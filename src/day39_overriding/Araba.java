package day39_overriding;

public class Araba {
    String hareket="Arabalar tekerler ile hareket eder";
    String hiz="Arabaalr motor gucune gor ehiz yaparlar";
    String yakit="Arabalar farkli yakitlar kullanabilir";
    String marka="Arabalar uretildikleri markaya sahiptir";

    public void motor(){
        System.out.println("Arabalar farkli markalarda motorr kullanirlar");
    }

public void yakitTuketimi(){
    System.out.println(" Arabalar motor gucu ve yakit rurune gore yakit tuketirler");
}



}
