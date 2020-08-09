package AzeCybertek;

import java.util.Arrays;

/**
 * /*
 *         Given an array of ints of odd length,
 *         return a new array length 3 containing the elements from the middle of the array.
 *         The array length will be at least 3.
 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 * midThree([1, 2, 3]) → [1, 2, 3]
 *          */

public class Venera1 {

//    public int[] midThree(int[] nums) {
//
//        int[] myArray = new int[3];
//
//        int middle = nums.length / 2;
//
//        myArray[0] = nums[middle-1];
//
//        myArray[1] = nums[middle];
//
//        myArray[2] = nums[middle+1];
//
//        return myArray;
//
//    }
//public int[] midThree(int[] nums) {
//    int mid = nums.length / 2; // middle of the 3
//
//    int[] middle3 = { nums[mid-1], nums[mid], nums[mid+1] };
//    return middle3;
//}
    public static void main(String[] args) {

        int [] nums= {1,2,3,4,5,6,7};
        int mid = nums.length / 2; // middle of the 3

        int[] middle3 = { nums[mid-1], nums[mid], nums[mid+1] };
        System.out.println(Arrays.toString(middle3));

    }

}
