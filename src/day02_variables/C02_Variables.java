package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        //eger istersek bir variable'i once declare edip sonra deger atayabiliriz

        String okulIsmi;
        //Java calismaya main method'tan baslar
        //sonra yukaridan asagi,solda saga calisir
        //Java deger atanmasi yapmadigimiz bir variable olusturmamiza itiriaz etmez
        //ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez



        okulIsmi= "Yidiz Koleji";
        System.out.println(okulIsmi);

        okulIsmi="Star Kloeji";
        System.out.println(okulIsmi);


        okulIsmi= "Java Koleji";
        System.out.println(okulIsmi);

        // println ile print arasindaki fark
        //println dediginizde yazdirma isleminden sonra alt satira gececek
        //sadece print dedigimizde yazdirma isleminden sonra alt satira gecmez

    }
}
