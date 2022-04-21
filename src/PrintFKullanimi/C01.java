package PrintFKullanimi;

public class C01 {
    public static void main(String[] args) {

        int sayi=123;
        String str="Ahmet";
        double dob=1.0205030456;

        System.out.println(sayi+ " - "+str+" - "+dob);
        System.out.printf("sayi: %d, str: %s, dou:%f",sayi,str,dob);//Stirng formatta olmali ve istedigimiz objeleri girebiliriz
        System.out.println();
        System.out.printf("sayi: %d, str: %S, dou:%f",sayi,str,dob);// ismi buyuk harfle yazdi
        System.out.println();
        System.out.printf("sayi: %d, str: %10S, dou:%f",sayi,str,dob);  //Ahmet'ten once 10 karakter bosluk birakti
        System.out.println();
        System.out.printf("sayi: %d, str: %-10S, dou:%f",sayi,str,dob); //sola yasladi
        System.out.println();
        str="Ahmet Bulutluoz";
        System.out.printf("sayi: %d, str: %-10.10S, dou:%f",sayi,str,dob);//kelimenin uzunlugu en fazla 10 olarak yazdirilir
        System.out.println();
        //sayilarda ,digitlerde uzunlugu sinirlandiramiyoruz
        System.out.printf("sayi: %-10d, str: %-10.10S, dou:%f",sayi,str,dob);//sayiyi sola yanstirdi ve 10 karakter bosluk birakti
        System.out.println();
        System.out.printf("sayi: %-10d, str: %-10.10S, dou:%.2f",sayi,str,dob); //dou:1,02 virgulden sonraki uzunlgu belirleyebildik
        System.out.println();
        System.out.printf("sayi: %-10d, str: %-10.10S, dou:%9.2f",sayi,str,dob);//basta bosluk birakir toplam uzunluk 9 olacak sekilde yazdirir
        System.out.println();
        System.out.printf("sayi: %-10d, str: %-10.10S, dou:%09.2f",sayi,str,dob);//bosluklar yerine 0 yazar
        System.out.println();
        System.out.printf("sayi: %-10d, str: %-10.10S, dou:%-9.2f",sayi,str,dob); //sola yasladi,boslugu sonda birakti
    }
}