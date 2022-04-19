package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {


    //HashSet duplicationa'a izin vermez elementler benzersizdir
    //bir elemani tekrar eklemek istedginizde eskisini siler yenisini uzerine yazar
    //Hashset null degere izin verir sadeece bir tane olur cunku hashset unique'dir
    public static void main(String[] args) {
        String str="Java cok guzel";
        System.out.println(str.hashCode());//-481588044

        String str2="Hava cok guzel";
        System.out.println(str2.hashCode()); //529529206

        Set<Integer> sayiKumesi=new HashSet<>();
        System.out.println(sayiKumesi.hashCode());  // cunku bos
        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode());  // 10
        sayiKumesi.add(20);
        System.out.println(sayiKumesi.hashCode());  // 30
        sayiKumesi.add(40);
        System.out.println(sayiKumesi.hashCode());  // 30

        //Java tum objelere gore bir hash code veriyor ve onlari cagirirken nasil getiriyor bilmiyoruz
        //bazen iki obje ayni hash coduna sahip olabilir buna hash Collision denir bunun icin:
        //>>>1.si linkedlist ile birbiirne ekleme
        //>>>>2. formulle yeni bir hash code uretmek once ilk yere gelir sonra digerine gecer




    }
}
