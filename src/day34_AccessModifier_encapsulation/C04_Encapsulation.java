package day34_AccessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /*Bir variable'i encapsule etmek icin
        1- Access modifier'i private yapariz
        2- Okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabilirizi
        -Eger sadece okunmasini istiyorsaniz getter
        -Sadece deger girilebilsin isterseniz setter methodlarini olustururuz.

        Bir variable icin hem getter hem setter olusturusaniz o variable public olmus gibi
        hem okuyup hem de yazilmasini saglayabilirsiniz/
        piyasada developerler arasinda genel uygulama bu sekildedir
         */
        C03 obj=new C03();
        System.out.println(obj.getSayi()); //0

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr()); //Java Java Java
        System.out.println(obj);
    }
}
