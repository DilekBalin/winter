package day43_garbage_abstractClass;

public abstract class C04 {

    /*
    Bir abstarct class'ta abstract veya concrete method'lar bulunabilir
    Child class'larin abstract method'lari override etmesi mecburi iken
    concrete method'larin override edilmesi opsiyoneldir.
     */

    public abstract void absmethod();
    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void concreteStaticMethod(){
        System.out.println("C04 concrete static method");
    }

    public static void main(String[] args) {
      //  C04 obj=new C04();

        /*
        Abstarcat classlar constructor'a sahiptir
        ancak Abstarct class'lardan obje olusturulamaz

        abstract class'lar obje barindrimayan
        sadece child class'lar icin uyulmasi sart olan veya opsiyonel birakilan
        ozellikleri tanimlayabildigimiz bir depo class gibidir
         */

        System.out.println("Bu class abstrac'tir");
        concreteStaticMethod();
    }
}
