package groupWork.Arrays;

public class S1 {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        // EA-internetten buldum cozumu/ hocada varsa sor istersen.

        int arr[][] = {{-9, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int min = arr[0][0];
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) //mat[i[
        {
            for (int j = 0; j < arr[i].length; j++)//mat[j]
            {

                if (arr[i][j]<min){
                    min=arr[i][j];

                }else if (arr[i][j]>max){
                    max=arr[i][j];

            }
            }

        }

            System.out.println("min deger="+min);
            System.out.println("maximum deger="+max);



   }}