package InterviewCodingTasks;

import java.util.Arrays;

/**
 * Write a method that can find the maximum number from an int Array
 */
public class Array_FindMaximum {

    public static int maxValue(int [] n) {

// First WAY
/*
        int max = Integer.MIN_VALUE;
        for(int each:n){
            if(each>max){
                max = each;
            }
        }
        return max;

    }

 */

// SECOND WAY

        Arrays.sort( n );

        return  n [ n.length-1 ];
    }
    public static void main(String[] args) {

        int[] arr = {5,3,15,12,25,50};
        System.out.println(maxValue(arr));

 // THIRD WAY

        int max = arr[0];

        for(int i = 0; i <= arr.length-1; i++  ){

            if(arr[i] > max){  // array's index are compared with each other, and whichever is greater will be assigned to the max
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}
