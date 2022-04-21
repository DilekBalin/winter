package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        //Java'da collection uyesi bir yapida
        //data turu Object secilirse her data trunden deger ekleyebiliriz
        //ancak bu duumda surekli casting problemleri ile karsilasabiliriz

        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);//[Ergin, 15, 10.2]
        list.set(1,(Integer)(list.get(1))+10);//1.index'tekini Integer olarak casting yaptik ve set ile yeniden duzenledik
        //neden casting yaptik?cunku Object'e 10 ekleyemeyiz bunun icin integer'a ihtiyac vardir

        Map<Integer,String> sinifList=new HashMap<>();//hizli olmasi icin HashMap sectik
        //Ayrica map bir interface oldugu icin obje olusturamayiz bu yuzden HasMap contr.kullandik


        //Bir sinifta ogrenci no ve isim,soy isim ve brans olarak Map olusturmak istiyoruz
        //key tek bir unique degerdir
        //ama value /deger birden fazla bilginin birlesiminden olusabilir
        //bu durumda daha sonra istedgimiz bilgilre dogru sekilde ulasabilmek icin
        //tum elementler icin value ayni bicimde olusturulmalidir
        // (veri siralamasi ve sekilsel acidan>>bosluk ve diger karakterler de ayni olmali)

        sinifList.put(101,"Ali,Can,Dev");// bi map'i nasil olusturuyorsak ayni yapida key ve value eklemeliyiz
        sinifList.put(102,"Veli,Yan,QA");
        sinifList.put(103,"Ali, Yan,C++");

        System.out.println(sinifList); //{101=Ali,Can,Developer, 102=Veli,Yan,QA, 103=Ali, Yan,Dev}
        System.out.println(sinifList.keySet()); //[101, 102, 103]  //sadece key'lere ulastik
        //set olarak geliyor yani bunlari manipule etmek  istersem set ile yapbilirim ki ustteki ornekte yaptik
        System.out.println(sinifList.values()); //[Ali,Can,Dev, Veli,Yan,QA, Ali, Yan,C++]   //sadece value'ler
        //bu sinifta Ali diye bir ogrenci var mi bilemeyiz bunun icin bazi islemler gerekecek



        



    }
}
