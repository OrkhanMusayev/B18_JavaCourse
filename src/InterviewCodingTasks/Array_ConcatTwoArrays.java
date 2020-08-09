package InterviewCodingTasks;

import java.util.Arrays;

public class Array_ConcatTwoArrays {

// FIRST WAY
    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};

        System.out.println(Arrays.toString(concatTwoArrays(arr1,arr2)));


// SECOND WAY
        int[] arrResult = new int[arr1.length + arr2.length]; // can contain all the elemnts from array1 and array 2

        for(int i = 0; i <arr1.length ; i++ ){
            arrResult[i] =  arr1[i];
        }


        for(int i= 0; i < arr2.length; i++ ){
            arrResult[arr1.length+i]     =   arr2[i];
        }



        System.out.println( Arrays.toString(arrResult)  );

    }
    }
