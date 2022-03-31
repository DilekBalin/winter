package day30_passByValue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("method call sonrasi: "+Arrays.toString(arr)); // [1, 2, 3]
        //kalici degisikligi kabul etmedi cunku main method diger methodun gelip de icindeki variable i degistrimesine izin vermez
    }

    private static void arrDegistir(int[] arr) {
        arr= new int[5]; //  [0, 0, 0, 0, 0]  //yeni bir array olusturduk
        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0, 0]
    }
}
