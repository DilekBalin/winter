package day20_scope_Arrays;

public class C01_InstanceVariables {


    //Instance (object) variable :yapılan degisiklikler sadece o objeyı ilgilenndirir
    // ogretmen adı ogrencı notu gibi//sadece kişiyi ilgilendiri
    //Static (Class ) variable//okul adı adres gibi//herkesi ilgielndirir
    //Local (Method) variables
    //loop variables


        int sayi; //Class'ın icinde main methodun dısında olusturduk
        String bransIsmi="Java";
        boolean okuldaMi;

        public static void main(String[] args){

            //sayi=10; sayi varaible'i static olmadıgı icin main method'tan direkt kullanılamaz
            //intance variable'lara static methodlardan ulasabilmek icin obje olusturmmız gerekir


            C01_InstanceVariables obj1= new C01_InstanceVariables();  //bu class'ın ilk objesini olusturduk Cl
            System.out.println(obj1.sayi);   // 0   cunku deger atamadık
            obj1.sayi=10; //sayıya deger atadık   //ogretmenin adı gibi sadece pgretmeni ilgilendirir
            System.out.println(obj1.sayi);//10 verir cunku deger atadık sadec obj1'in degeri 10 oldu
            obj1.bransIsmi="SQL";
            System.out.println(obj1.okuldaMi); //false


            C01_InstanceVariables obj2=new C01_InstanceVariables();   //2.objeyi yaptık
            System.out.println(obj2.sayi);  //0    cunku bu bir baska obje;
            System.out.println(obj2.bransIsmi);//java yazdırır//java once obj2 yi ilk olusturulan yerde bulur ve 31. satıra gider
            //orada deger gormeyince en basa 14.satıra gider

            System.out.println(obj2.okuldaMi); //false   aynı sekilde java bunu 28.satırda bulur ve degr goremeynce en basa gider
            //15 satırda da deger atanmadıgı icin false yazdırır
            //obj1 okuldaMı sorusu obj2'yi ilgilendirmez



    }
}
