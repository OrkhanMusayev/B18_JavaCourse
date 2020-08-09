package Kudrat;

import java.util.Arrays;

public class EvenOdd_2DArrays {
    public static void main(String[] args) {

//        String [][] arr ={{"12","13","10"},{"8","11","18"}};
//
//
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                int temp = Integer.parseInt(arr[i][j]);
//                if(temp %2 ==0){
//                    arr[i][j]="even";
//                }else{
//                    arr[i][j]="odd";
//                }
//            }
//        }
//
//        System.out.println(Arrays.deepToString(arr));

        int [][] arr = {{12,13,10},{8,11,18}};

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                if(arr[i][j] % 2 == 0){
                    System.out.print("even ");
                }else{
                    System.out.print("odd ");
                }
            }
        }



    }
}
