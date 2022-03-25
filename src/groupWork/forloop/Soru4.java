package groupWork.forloop;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        /*
  TASK :
  Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
  String parametreli return type li reverseWord isminde bir method create ediniz

   Test Data :
  İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
  Output : versin açıklığı zihin arkadaşlara Javacı Allah
   */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String cumle= scanner.nextLine();

        System.out.println(reverseWord(cumle));


    }

    public static String reverseWord(String cumle) {
        String arr[]=cumle.trim().split(" ");
        String cumleTers="";

        for (int i = arr.length-1; i >=0; i--) {

            cumleTers+=arr[i]+ " ";

        }
        return cumleTers;
    }
}
