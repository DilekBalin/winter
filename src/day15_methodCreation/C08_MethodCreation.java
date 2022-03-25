package day15_methodCreation;

public class C08_MethodCreation {
    public static void main(String[] args) {
         //C07_MethodCreation.
        // class ismini yazıp . koyunca method gelmez
        //cunku hosgeldinYazdir() methodu private'dir onu public yaparsak gelir





    }

    public static class C09_MethodCreation {
        public static void main(String[] args) {

            String isim = "yasemin yalcin";
            String soyisim= "sari";
            String kKNo="1234567890128795";



           String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim);
            //isimSoyisimGizle(isim,soyisim); //bu method'u cagırmak kapıcıya ekmek al demek gibidir
          //  String gizlenmisIsimsoyisim= bu bir variable'dır ve bunu yazmamızın sebebi    isimSoyisimGizle(isim,soyisim); ksımını bir variable'a koymakti
            //  (ekmek artık sepetimizde ister yeriz istersek yemeyiz)

            // argument yazmak zorundayız cunku neyi gizlemesi gerektigini bilmesi lazım
            //bana isim ve soyismin gizlenmis halini getirmesini istiyorum
            //bekledigim donus String olur


            System.out.println(gizlenmisIsimSoyisim);  //calısır

          String gizlenmiskKNo=  krediKartiGizle(kKNo);
            System.out.println(gizlenmiskKNo);

            String yeniIsim = isim.substring(0,1).toUpperCase()+
                    isim.substring(1).replaceAll("\\S","*");
            String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).replaceAll("\\S","*");

            String yenikKNo= "**** **** **** " + kKNo.substring(12);
            System.out.println("isim-soyisim : " + yeniIsim + " " + yeniSoyisim + " \nkart no : " + yenikKNo);


            //asıl amac konsola yazı yazdırmak degildir
            //asıl amacımız yapılan degisiklikleri o hali ile kaydedebilmektir
            //simdiye kadarki sorularda hep yazdırdık
            //bu soruda kaydetmek istiyorum
            //olay sadece yazdırmak degilse
            //bu method' isim soyisim gizle dedik bundan sonra gizlenmis isim ve soyisim  bana lazım
            //void olunca bana bir sey getirmesine gerek yok

            //eger bir method'tan bir islem yapmasını ve yaptıgı işlemi bize getirmesini isterseniz
            //return type void degil bize getirecegi sonucun data turunde olmalıdır



        }

        private static String krediKartiGizle(String kKNo) {

            String yenikKNo= "**** **** **** " + kKNo.substring(12);
            return yenikKNo;

        }

        private static String isimSoyisimGizle(String isim, String soyisim) { //eskiden burası void'ken simdi String yaptık
            String yeniIsim = isim.substring(0,1).toUpperCase()+
                    isim.substring(1).replaceAll("\\S","*"); //bu method

            String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).replaceAll("\\S","*");

           return yeniIsim+" "+yeniSoyisim;   //String dondurmek icin yazdık

            //yazdırmak istesek bu adım agerek duymadan yazdırırdık
            //Method olusturmada 3.Adım:
            //sadece bir sey mi yazdıracak yoksa bize bir data mı verecek karar vermeliyiz
            //bu soruda gızlenmis isim dondurmesi istendiginden
            //return type'ı void değil String sectik
            //ve method'un sonuna return edilecek detayı yazdık



            //butun bu islemleri method'ta da yaaprdık ama bize dondurmezdi
            //requarements ne isteniyorsa onu yapmalıyız
            //isim ve soy isim gizlemek istiyorsam bu class'taki bilgileri kullanabilirm


        }
    }
}
