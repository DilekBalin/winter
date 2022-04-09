package day39_overriding;

public class Toyota extends Araba{


    protected String hiz = "Toyota araclar maksimum 220 km hiz yaparlar";
    protected String marka = "Toyota";
    String sirketMerkezi="Japonya";

    public void motor() {
        System.out.println("Toyota arabalar Toyota marka motor kullanirlar");
    }

   public void garanti(){
       System.out.println("Toyota araclar 10 yil garantilidir");
    }
}
