package Edabit;

import java.util.Arrays;

public class MultiplyByLength {

    public static int[] MultiplyByLength(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i]*=arr.length;
        }
        return arr;
    }

    public static void main (String [] args ){

        int[] arr = {2, 3, 1, 0}; // [8, 12, 4, 0]

        System.out.println(Arrays.toString(MultiplyByLength(arr)));
    }
}
