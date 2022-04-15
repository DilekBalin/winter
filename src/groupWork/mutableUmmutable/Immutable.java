package groupWork.mutableUmmutable;

public class Immutable {
    public static void main(String[] args) {

        String str1="Eren";
        String str2="Eren";      //eger yeni bir obje olusturma ya da islem yapma yoksa java string havuzunu kontrol eder
        //yani zaten daha once de olustrulan br eren havuzu oldugu icin yeni degeri de oraya atar
        String str3= new String ("Eren");      //Burada ise hemen yeni bir obje olusturur ve yeni bir referans degeri veririr, icine bakmaz
        String str4=str1+"";    //islemin sonucunu ongoremez o yuzden yeni bir referans degeri ile birlikte yeni bir obje olusturur
        //4 objenin de degeri ayni ama Heap memory'de 3 tane obje olusturuldu

        //Equals ile === farki:
        //Equals derse sadece icerige bakar
        //==  derse hem icerige hem de referansa bakar
        System.out.println(str1.equals(str2));  //
        System.out.println(str1.equals(str3));  //
        System.out.println(str1.equals(str4));  //

        System.out.println(str1==str2);  //    i
        System.out.println(str1==str3);  //
        System.out.println(str1==str4);  //

    }
}
