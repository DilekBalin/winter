package groupWork.Arrays;

public class S2 {
    public static void main(String[] args) {

        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

         */

        int arr1[][]={ {0,2,-1}, {3,8,9}, {7}} ;
        int arr2 [][]= { {-7,6,-9}, {0,12}, {19}};

        int top1=0;
        for (int i=0; i<arr1.length; i++) {
            for (int j=0;j<arr1[i].length; j++) {
                top1 += arr1[i][j];

            }

        }
        System.out.println("toplam arr1:"+top1);



        int top2=0;
        for (int i=0;i<arr2.length; i++){
            for (int j=0;j<arr2[i].length; j++){
                top2+=arr2[i][j];

            }
        }

        System.out.println("top2="+top2);
        System.out.println("total toplam="+(top1+top2));
    }}