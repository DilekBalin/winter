package groupWork.ilkKonular;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /* TASK :
Kullanıcıdan bir tarih girmesini siteyin
 Daha sonra bu tarihi
 gün, ay ve yıl
 ay, gün, yıl ve y
 ıl, ay, gün sıralarına çevirerek yazan bir kod olusturun.
Örnek Ekran Çıktısı
Lütfen günü giriniz: 10
Lütfen ayı giriniz: 02
Lütfen yılı giriniz: 2009
Gün ay yıl: 10.02.2009
Ay gün yıl: 02.10.2009
Yıl ay gün: 2009.02.10
*/
        Scanner scan = new Scanner(System.in);
        int gun, ay, yil;

        System.out.println("Lutfen bir gun giriniz : ");
        gun = scan.nextInt();

        if (gun > 0 && gun <= 31) {
            System.out.println(gun);
        } else {
            System.out.println("Hatali giris... Program sonlandirildi. \nLutfen yendiden deneyiniz");
            return;
        }
        System.out.println("Lutfen bir ay giriniz : ");
        ay = scan.nextInt();

        if (ay > 0 && ay <= 12) {
            System.out.println(ay);
        } else {
            System.out.println("Hatali giris... Program sonlandirildi. \nLutfen yendiden deneyiniz");
            return;

        }
        System.out.println("Lutfen bir yil giriniz : ");
        yil = scan.nextInt();

        if (yil > 1000 && yil < 2500) {
            System.out.println(yil);
        } else {
            System.out.println("Hatali giris... Program sonlandirildi. \nLutfen yendiden deneyiniz");
            return;
        }
        System.out.println("gun/ay/yil : " + gun + "/" + ay + "/" + yil);
        System.out.println("ay/gu/yil : " + ay + "/" + gun + "/" + yil);
        System.out.println("yiul/ay/gun : " + yil + "/" + ay + "/" + gun);
    }
}
