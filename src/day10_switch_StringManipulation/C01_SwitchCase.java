package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //Kullanıcıdan sayı olarak kacinci ay oldugunu alip
        //istenen ay ismini yazdiran bir perogram yazınız

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo= scan.nextInt();
        //Bunu if else ile yapabiliriz abcak art arda 12 if else cok kalabalık ve
        //anlasılması guc olabilir
        //Bunun yderine switsch case yapisini kullanabiliriz


        switch (ayNo){
                        case 1:
                            System.out.println("Ocak");
                            break;
                        case 2:
                            System.out.println("Subat");
                            break;
                        case 3:
                             System.out.println("Mart");
                            break;
                        case 4:
                            System.out.println("Nisan");
                            break;
            case 5:
                System.out.println("Mayis");
                break;
                case 6:
                System.out.println("Haziran");
                    break;
                case 7:
                System.out.println("Temmuz");
                    break;
                case 8:
                System.out.println("Agustos");
                    break;
                case 9:
                System.out.println("Eylul");
                    break;
                case 10:
                System.out.println("Ekim");
                    break;
                    case 11:
                System.out.println("Kasim");
                        break;
                        case 12:
                System.out.println("Aralik");
                break;


            default:
                System.out.println("Lutfen gecerli bir ay giriniz");


                //Switch icine yazilan variable'nin degerine gore ilgili case'i bulur
                    // burdan sonrasını sonuna kadar calıstırır  ta ki break gorene kadar
                    //Eger break yoksa ilgili case'den asagı dogru tum case'ler calısır.
                    //break kırmak demek yani bu blogun dısına cık demek

                    //if else'deki son else gibi geriye kalan tum durumlari
                //tamammen kapsayacak bir satır daha ekleyebiliriz








        }
        }

}
