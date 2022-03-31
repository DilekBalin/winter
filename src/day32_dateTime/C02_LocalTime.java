package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm= LocalTime.now();
        System.out.println(tm);  //20:09:49.273381


        //bir islemin ne kadar surede bittigini ogrenmek istiyorsak
        //
        int sayi=0;
        for (int i=0;i<100000;i++){
            sayi+=i;
        }
        LocalTime loopSonrasi= LocalTime.now();
        System.out.println(loopSonrasi);  // 20:12:28.687110300

        int nano1=tm.getNano();
        double nano2=loopSonrasi.getNano();
        System.out.println("islem "+ (nano2-nano1)+ "nanosaniyede bitti");

        //ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));  //12:59:55.370272200


        //istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz


    }
}
