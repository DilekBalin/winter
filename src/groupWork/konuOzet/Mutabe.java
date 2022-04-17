package groupWork.konuOzet;

import java.util.ArrayList;
import java.util.List;

public class Mutabe {
    public static void main(String[] args) {



    /*
    Immutable class'lar objeleri bir kez olusturduktan sonra degistiremedigimiz class'lardir
    Ornegin String'te bir method olusturdugumuzda kendisi degismez ama listler 'deki degiisiklik kalici oluir
     */

        String str="Java cok guzel";
        System.out.println(str.replaceAll("a","*"));  //J*v* cok guzel   //Gecici bir degisim
        System.out.println(str); //Java cok guzel  //degismedi cunku ataam yapmadik

        str="Java gercekten cok guzel"; //str'ye yeni bir sey atadigimiz icin degisir ve bu degisim kalici olur
        System.out.println(str);//Java gercekten cok guzel





        List<Integer> sayilarList=new ArrayList<>();   //int dersek kabul etmez
        System.out.println(sayilarList);  // []
        sayilarList.add(5);
        sayilarList.add(9);
        sayilarList.add(9);
        System.out.println(sayilarList); //[5, 9, 9]  kalici olarak degisti

        /*
        Immutable class'lardan olusturulan objeler de immutable olur
        Immutable bir objeyi degistirmek istersek Java o objeyi klonlar ve
        yapilan degisiklikleri klonlanmis yeni obje uzerinde gerceklestirir>>referans ayni objeler farkli isim ayni oldugu iicn klon diyoruz

        Ayni anda bircok kisinin kullanacagi programlar icin buna ihtiyac duyulmustur
        thread safe>> guvenli es zamanli calisma

  */
        //Java atama yaparken her seferinde yeni bir obje olusturuyor(immutable'lar icin)
    String str1="A";
        System.out.println(str1);//A
    str1+="B";
        System.out.println(str1); //AB
    str1+="C";
        System.out.println(str1);//ABC


        ArrayList<Integer> values =new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);  //sonucu gor

    }}