package day27_constructor;

public class Cons01 {
    //default conctructor'un hicbir ozelligne mudahale edemzsiniz
    // kalip nasilsa o sekilde bir obje verir
    //ama biz obje olustururken ozellikler de olsun isteriz
    //ornegin bir fabrikada alinan iscilerin hepsi farkli sadece vasiflari isci

    //aslinda hicbir constructor olusturmasak bile java bize bir default constructor olusturur ve gorunmez
    //Java da bir obje uretmek istiyorsanz mutlaka constructor kullanmalisiniz
    //egr biz kendi ellerimizle bir  constructor yazarsak Java artik insiyatifi elimize verir ve satndart constructoru olduruur


    public Cons01(String par1) {    //bir constructor olusturduk
        System.out.println("parametreli");
    }

    Cons01(){
        System.out.println("prametresiz");


//Kisacasi her class"ta bir tane default constructor vardir ve biz elimizle bir constructor yazarsak
        //Java default olani oldurur
        //biz projemizin saglikli yurumesini istiyorsak kendi constructor'umuzdan sonra
        //yeni ve parametresiz bir constrtuctor yazmalayiz:Cons01(){}

        //biz constructor'un basina herhangi bir axcess modifier yazmasak Java onu default modifier kabul eder
        //default'a sadece o package dekiler ulasir
        //yani biz Cons01(){ olana package 27'den ulasabiliriz
        //public Cons01(String par1) {   buna ise butun proje kapsaminda ulasabiliriz
    }
    }



