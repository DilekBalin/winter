package day41_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;

        try {
            c=a/b;
        } catch (Exception e) {   //catch'in icine bekeldigimiz exception turunu yazariz
            //Burada yazdigimiz e: Java'nin exception'i atayacagi obje
            //Exception ise olusan exception'in turu

           // e.printStackTrace();
            System.out.println(e.getMessage());  //by zero >> sebebini soyledi


        }
        System.out.println(c);


  //Exception ismi ,data turu(class adi)
        //e ise variable ismidir
        //e. yzinca ilgili excepion class'indan kullanabilecegimiz methodlari gorebiliriz
    }
}
