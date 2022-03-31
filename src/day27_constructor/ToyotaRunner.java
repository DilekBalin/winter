package day27_constructor;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota t1=new Toyota();    //obje olusturduk
        System.out.println(t1.marka); //Toyota   marka adki variable'i buldu ve degeri yazdirdi
        System.out.println(t1.tekerAdedi);//4
        System.out.println(t1.model); //null cunku deger atanmadigi icin String'in default degerini yazdirdi cunku
        //o variabler class icinde oldugu icin instance yani java default degerini kullanabiliyor
        System.out.println(t1.yil); //0  // int default degeri 0
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2022;
        System.out.println("T1 model= "+ t1.model+ " ,yakit:"+ t1.yakit+ " ,yil:"+ t1.yil ); //T1 model= Corolla ,yakit:Benzin ,yil:2022
         t1.maxHiz();//Benzinli araclar max 240 km jhiz yapabilir.
         t1.renkTercihleri();  //Corolla icin renk secenegi beyaz ve kirmizi



        Toyota t2=new Toyota();
        System.out.println(t2.model);//null cunku t2 icin henuz bir deger atanmadi
        t2.model="Yaris";
        t2.yakit="Benzin";
        t2.yil=2021;
        System.out.println("T2 model= "+ t2.model+ " ,yakit:"+ t2.yakit+ " ,yil:"+ t2.yil );//T2 model= Yaris ,yakit:Benzin ,yil:2021

        //depo class"ta yazdirilan ve atanmis degerler burda hepsi icin gecerlidir
        //ornegin marka,tekerAdedi ve motoruVarMi
        System.out.println("marka:"+t2.marka+ "  ,teker adedi: "+t2.tekerAdedi+ " , motoru var mi: "+ t2.motoruVarMi);
        t2.maxHiz(); //Benzinli araclar max 240 km hiz yapabilir.
        t2.renkTercihleri(); //Yaris icin renk secenekleri sari ve lacivert"


        /*Degismeyecek degerleri objeyi olusturdugumuz class'ta (depo resource kaynak Class) yazariz
         Eger herbir objeye gore degisecekse o zaman deegr atamayiz ve
         objeleri yeniden olusturdugumuz class'ta yeni degerler atariz
        ornegin t1.model="Corolla";
               t1.yakit="Benzin";
               t1.yil=2022;   gibi

        Son olarak da methodlar kullanarak otomatik degerler atayabiliriz
        ornegin model ve yakitimiza gore max hiz ve renk secenekleri belirleyebildik
                 */

    }
}
