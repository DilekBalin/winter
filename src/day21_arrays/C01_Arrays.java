package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        //arrays nasıl declare edilir?
        //data turu,array ismi ve koseli parantez yazarak


        int arr1[]={1,3,5}; //variable'dan sonra koseli parantez'
        int[] arr2={2,3,5}; //data turunden hemen sonra koseli parantez
        int [] arr3={1,4,5}; //data bosluk ve koseli pazarntez
        //arrays 3 farklı sekilde declare edilebilir

        double arr4[]={10.2,20.1,5};

        String arr5[]={"Ali,Veli,Ayse"};


         //assign sart mıdır?
        int arr6 [];//itiraz etmez ama kullanmak istedigimizde mutlaka dger ataması yapmamız gerekir

        //hem declare edp hem de atama yapacaksam nasıl yapabilirim?
        //1.declare edip esitligin sagına susulu parantez icerisinde degrleri yazabilirim
        String arr7[]={"Ali,Veli,Ayse"}; //burda hem dger atadık hem de boyutu belli


        //2.İcine deger atamadan olusturmak isterseniz boyutunu belirlememiz gerekir
        int arr8[]=new int[5]; // aslında javadan yeni bir array olusturmasını istiyoruz o da boyut ister ve boyut 5 yazdık
        //java icinde 5 tane default deger olan bir array olusturur
        //[0,0,0,0,0]  //yani bunu uretit cunku integer default'u 0'dır



    }
}
