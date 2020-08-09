package Kudrat;

import java.util.Arrays;

public class swapArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<arr.length-1;i+=2){
            int num = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = num;
        }

        System.out.println(Arrays.toString(arr));
    }
}
