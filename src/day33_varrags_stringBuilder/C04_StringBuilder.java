package day33_varrags_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasin Java");
        System.out.println(sb1.indexOf("Java")); //8
        System.out.println(sb1.lastIndexOf("s")); //4
        System.out.println(sb1.indexOf("s")); //2

        System.out.println(sb1.replace(0,7,"Ne guzel"));
        System.out.println(sb1); //Ne guzel Java  normalde string olsaydi degismezdi ama bu immutable oldy=ugu icin kalici degisti

        System.out.println(sb1.toString().toUpperCase());  //NE GUZEL JAVA
        System.out.println(sb1);  //Ne guzel Java cunku oncesinde string e cevirmisti toString le o yuzden kalici degismedi
        System.out.println(sb1.delete(0,3)); //zel Java  //3 dahil degil
        System.out.println(sb1.deleteCharAt(5));//guzelJava


    }
}
