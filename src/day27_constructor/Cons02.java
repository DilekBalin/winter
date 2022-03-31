package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {

        Cons01 obj1=new Cons01();   //bir obje olusturduk ve default constructor devrede
     /*Cons01 class"inda hic constructor olusturmazsak
        Java default constructor"u kullandigindan obj1"i uretebiliriz

        Ancak biz parametereli ya da parametresiz bir constructor yazdigimizda
        Java default construcor'u siler

        biz default'un ozelligini baskalari da kullansin diye kendi yaptigimiz constructor'dan sonra
        ya yeni bir parametresiz konstructor yazariz  ya da objeli tarafa parametre atamaliyiz

         Dolayisiyla biz herhangi bir constructor olusturdugumuzda
                   daha once baska claslar veya kullanicilarin
                   olusturmus olabilecegi objeleri kullanabilmeleri icin
                   default constructor'in islevini gerceklestirecek
                 parametresiz bir constructor olusturmakta fayda var
*/


        Cons01 obj2=new Cons01("Java");
    }
}
