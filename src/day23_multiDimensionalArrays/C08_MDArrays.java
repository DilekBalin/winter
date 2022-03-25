package day23_multiDimensionalArrays;

public class C08_MDArrays {
    public static void main(String[] args) {
        //Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        // ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

        //eger multi dmensional ile ugrasmak istityorsak bu ic ice array demektir
        //Bize verilen array 2 katlıdir bastaki susulu parantez sayısı kadar

        int arr[][]={{1,2,3}, {4,5}, {6}}; //3 tane inner array var 2 tane de outer array
        int carpim=1;  //carpim icin bir konteynır olusturduk

        for (int i=0; i<arr.length; i++){
            //sadece son elemanlar olsacagı icin icerdeki j ye gerek yok
            //yani icerde gezmeye ihtiyacım yok son elemntler lazım sadece

            carpim *= arr[i][arr[i].length-1]; //90
        //arr [0][2] =3   carpım=3
        //arr [1][1] =5   carpım=15
        //arr [2][0] =6   carpım=90

        }

        System.out.println("son elemntlerin carpimi:"+carpim);

        }


}


