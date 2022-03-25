package day14_halaStringManipulation;

public class C02_terstenYazma {

    public static void main(String[] args) {

        //Kullanıcıdan 4 harfli bir kelime isteyin
        //ve girilen kelimeyi tersten yazdirin

        // String tersStr1=input1.substring(input.length()-1);    ///sadece en sondaki harfi alırdım

        String input="Mavi";
        String tersStr= input.substring(3).toUpperCase() +
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
        System.out.println(tersStr);


        //2.Yol:
        //CharAt methodu:

        System.out.println(""+input.toUpperCase().charAt(3)+
                input.toLowerCase().charAt(2)+
                input.toLowerCase().charAt(1)+
                input.toLowerCase().charAt(0)) ;




    }
}
