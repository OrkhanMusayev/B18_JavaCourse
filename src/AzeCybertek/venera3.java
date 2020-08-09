package AzeCybertek;

import java.util.Arrays;

/**
 * Given an int array of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present.
 * frontPiece([1, 2, 3]) → [1, 2]
 * frontPiece([1, 2]) → [1, 2]
 * frontPiece([1]) → [1]
 */
public class venera3 {

//    public int[] frontPiece(int[] nums) {
//        if(nums.length >= 2){
//            int []k = {nums[0], nums[1]};
//            return k;
//        }
//        return nums;
//    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        if(a.length >= 2){
            int []b = {a[0], a[1]};
            System.out.println(Arrays.toString(b));
        }

        System.out.println(Arrays.toString(a)); // buna fikir verme
    }
}
