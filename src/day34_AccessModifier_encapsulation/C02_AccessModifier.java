package day34_AccessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj =new C01();
        obj.acikString="Bye";
        C01.acikSayi=50;

        //C01=15;  private access modifier'i oldugunda baska class'tan erisim saglanamz

        //obj.method1;

        //C01 objParametreli=new C01(5);  // private access modifier'i oldugundan baska class'tan erisim saglanamz
    }
}
