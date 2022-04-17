package day33_varrags_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 =new StringBuilder("Prize dikkat");
        System.out.println(sb1.insert(12," edin"));
        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8));
        System.out.println(sb1.reverse()); //nidetakkid ezirP attayaH
        System.out.println(sb1.reverse());
        System.out.println(sb1.substring(3,5));
        System.out.println(sb1);
        System.out.println(sb1.subSequence(3,5));
        System.out.println(sb1);

    }


}
