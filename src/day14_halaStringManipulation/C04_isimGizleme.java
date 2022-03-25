package day14_halaStringManipulation;

public class C04_isimGizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        String isim = "yasemin yalcin";
        String soyisim= "sari";
        String kKNo="1234567890128795";

        String yeniIsim = isim.substring(0,1).toUpperCase()+ //sadece ilk harfi aldık ve buyuk harfe cevirdik
                isim.substring(1).replaceAll("\\S","*"); // 1.index de de dahil sonraasını yazdıracak
        //ama space olamayan her seyin yerine yıldız koy dedik cunku birden fazla isim de olabilir

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo= "**** **** **** " + kKNo.substring(12); //String icine 12 tane yıldız yazdık cunku kredi kartlari hep 16 karakterli
        //ve substring icine 12 yazdık yani 12.index de dahil yazdır demek oluyor bu

        System.out.println("isim-soyisim : " + yeniIsim + " " + yeniSoyisim + " \nkart no : " + yeniKKNo);

        //input degistiginde output da degisiyorsa bu dinamiktir.


    }
}
