package groupWork.konuOzet;

public class DegistirleemzString {
    public static void main(String[] args) {




        String str1="Eren";
        String str2="Eren";
        String str3= new String ("Eren");
        String str4=str1+"";


        //Equals ile === farki:
        //Equals derse sadece icerige bakar
        //==  derse hem icerige hem de referansa bakar

        System.out.println(str1.equals(str2));  //
        System.out.println(str1.equals(str3));  //
        System.out.println(str1.equals(str4));  //

        System.out.println(str1==str2);  //
        System.out.println(str1==str3);  //
        System.out.println(str1==str4);  //

    }
}
