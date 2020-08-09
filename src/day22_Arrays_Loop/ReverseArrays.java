package day22_Arrays_Loop;

import java.util.Arrays;

public class ReverseArrays {
    //     1. write a program that can reverse the array

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        //            0, 1, 2, 3, 4

        for(int i = arr.length-1; i >= 0; i--){
            int eachNum = arr[i];
            System.out.print(eachNum);
        }

        System.out.println("===========================================");

        // [5,4,3,2,1]
        int [] RevArr = new int[arr.length]; // [0,0,0,0,0]
        /*
               i        j
        RevArr[0] = arr[4];
        RevArr[1] = arr[3];
        RevArr[2] = arr[2];
        RevArr[3] = arr[1];
        RevArr[4] = arr[0];

         */


        int j = arr.length-1; // start from 4,3,2,1,0
        for(int i = 0; i < arr.length; i++){
            RevArr[i] = arr[j];
            j--;
        }



        System.out.println(Arrays.toString(RevArr));




    }
}
