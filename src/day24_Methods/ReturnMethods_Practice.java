package day24_Methods;

import java.util.Arrays;

public class ReturnMethods_Practice {

    /**
           4. Create a function that can print the maximum number from any given array
     */

    public static void main(String[] args) {
        int[] arr = {9,8,7,100,200,50,40};

        int max = maxNum(arr);
        System.out.println(max);

        int min = minNum(arr);
        System.out.println(min);
    }



    public static int maxNum(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    public static int minNum(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }


}
