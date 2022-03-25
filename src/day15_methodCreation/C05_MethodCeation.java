package day15_methodCreation;

public class C05_MethodCeation {
    public static void main(String[] args) {

        String str="Ali";
        // C04.  dedigimizde onumuze method'lar gelir tıpkı String'teki substring() gibi

        C04.ucHarfiTersineCevir(str);  // iLA
        // parametremiz ise paranteze yazdıgımız str'dir
        // C04 dememizin sebebi Java'ya  o methodu hangi Class'ta bulacagını gostermektir.

         str="Java";
        C04.dortHarfiTersineCevir(str);
       // C04.besHarfiTersineCevir();  //olmadı cunku C04 Class'ında bu method yok



    }
}
