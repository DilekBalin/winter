package day16_methodCreation;

public class C04_forLoop {
    public static void main(String[] args) {
        //bir islemi dinamik hale getirmek icin kullanırız
        //ornegin bir kelimeyi tersten yazdır dedigimizde kelimenin harf sayısı ne olursa olsun yazdırır
        //tekrar sayısı belirli olmalıdır
        // en onemli is baslangıcı belirlemek   //str.length ()-1
        // nereye kadar>>> ilk harfin index'i dolayısıyla sıfıra kadar git
        //her seferinde -1 azaltacagım cunku sondan basa geliyoruz

        //for(Starting Value;Ending Condition;increasing or Decreasing the Value){
        //}   >>>> for loop syntax'i
        //for(int i=4; i>1;i--){
        //System.out.print.ln(i);
        //}


        //soru
        //Verilen string'i tersten yazdıran bir kod yazınız

        String str="Valla bu Java cok zevkli";
        for (int i = str.length()-1; i >=0 ; i--) {
            //nerden baslasın dedik legth() -1 yani sondan baslayacak
            // nereye kadar  gitsin?>>>>0  oluncaya kadar gitsin kelime harf sayısı buyuk esit 0 olacak
            //ve azalacak i--
            System.out.print(str.substring(i,i+1));  //print yaptık ki yan yana yazdırsın
        }
        {


        }
    }
}
