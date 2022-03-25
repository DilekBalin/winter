package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,10};
        //Ementleri for loop ile yazdıralım
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");

        //bunu for ech loop ile yapaack olursak
        //for each loop2u calıstırmak icin hedef bir collection vermeliyiz

        for (int each : arr //arrr arrayine git ve herbir each getir
             ) {
            System.out.print(each+" ");

            //avantajı index baslangıc degeri bitis degeri gibi detaylarla ugradmmamıza gerelk kalmadan
            //collections'tan tum elementleri bize getirir
            //dezavantajı:index'e baglı bir islem yapamayız



            //SOCRATIVE NOTLARI:
            // list.remove(9) ; demek 9.index'tekini sil demektir.yoksa array deki 9 elementini sil demek degildir.
            // {Ali,Can,Ayse,Havva}      list.set(1,"Havva")     ekran cıktısı>>>>1 [Ali,Havva,Ayse]  cunku set 1.indextekini yenisiyle degistirdi
            //add sadece ekliyor set ise yeni degeri yazarken oncekini siliyor.

            /*ArrayList<String>list=new ArrayList<String>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");

            System.out.println(list.remove("2"); // 2. indexTekini yani C'yi siler ve delil olarak da C'yi getirir
            //Burada bizden listeyi isteseydik [A,B,D] olurdu
            System.out.println(list.remove("C");  //Java gider bu element varsa kaldırır yoksa False doner

            for dan sonra yazdırdıgımız normal yazdrılır    A B C D
            obur turlu yazdırmada koseli parantez kullanılır  [A B C D]


             */
        }
    }
}
