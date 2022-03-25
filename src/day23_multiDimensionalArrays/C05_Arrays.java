package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};

        //arr[3]=8;  //Array'de olmayan bir index'e atama yapamayız var olan array'in sınırlarının dısında
       // arr={1,3,5};   //atama yaparken koseli paranteze bir daha gerek yok
        //var olan bir array'e aynı boyutta bile olsa direkt yeni degerler iceren bir array atayamayız

        arr=new int[4];  //[0,0,0,0] //yeni bir array olusturduk yani yeni bir tanımlama yaptıgımız icin kabul eder
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]


        int arrYeni[]= new int[5];
        arr=arrYeni;  //eski arr'ye simdi olusturdugumuz arry'yi atadık ve kabul etti
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]

        //arrYeni'ye degerler atadık
        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[2, 0, 0, 5, 0]

        // bir array'e icinde hazır elementlerin oldugu yeni bir array atamak  isterseniz bunu {1, 2, 3} seklinde degil
        //new int[3] diyerek olusturup sonra deger atayarak tanımladıgımız bir array'i
        // assign ederke yapabiliriz
        //sag taraf suslu parantezli bir sey yapamazsınız ama olusturdugunuz bir array!i direkt atama yapabilirsiniz
        //yani once bir array olusturup sonra ona atama yapabilirsiniz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;  //en eski arr'e en son yaptıgımız ve deger atadıgımız arr'i atadık ve kabul ettş
        System.out.println(Arrays.toString (arr));//[1, 2, 3, 4, 5]

        //kısacası var olan bir array'e ekleem cıkarma yapamayız ancak
        // var olan bir array'e yeni bir array olusturup onu atayabiliriz
        //arry artık ski kimligini unutur yenisi ile devam eder
    }
}
