package InterviewCodingTasks;

import java.util.Arrays;

/**
 * Write a method that can find the minimum number from an int Array
 */
public class Array_FindMinimum {

    public static int minValue(int[] n) {
// FIRST WAY
//        int min = Integer.MAX_VALUE; // integer's max value
//        for(int each:n){
//            if(each<min){
//                min = each;
//            }
//        }
//
//        return min;
//    }

// SECOND WAY
        Arrays.sort(n);
        return n[0]; // minimum num is 9
    }
    public static void main(String[] args) {

        int[] arr = {55,65,45,75,15,25,9,11,20}; // min num is 9
        System.out.println(minValue(arr));

// THIRD WAY
        int min = arr[0];

        for(int i=0; i<= arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min); // 9
    }




}
