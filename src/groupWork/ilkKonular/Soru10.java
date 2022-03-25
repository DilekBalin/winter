package groupWork.ilkKonular;

public class Soru10 {
    public static void main(String[] args) {



/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

            String str="aabbcccccddddaaa";

            yenibir(str);    }

        private static void yenibir(String str) {
            String sonuc="";
            for (int i = 0; i <str.length(); i++) {
                if (!sonuc.contains(str.substring(i,i+1))){
                    sonuc+=str.substring(i,i+1);
                }}
            System.out.println(sonuc);





    }
}
