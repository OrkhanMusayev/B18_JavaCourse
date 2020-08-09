package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given an array nums, calculate count of even numbers in nums and print out to console.
 *
 * nums → [2, 1, 2, 3, 4]) → 3
 * nums → [2, 2, 0, 3, 5]) → 3
 * nums → [1, 3, 5, 7, 9]) → 0
 */
public class REPLIT_107 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

// FIRST WAY
    int countEven=0;
    for (int i=0; i<=nums.length-1;i++){
        if(nums[i]%2==0){
            countEven++;
        }
    }
        System.out.println(countEven);

    // SECOND WAY

//        int count = 0;
//        for(int eachNum : nums){
//            if(eachNum % 2 == 0){
//                count++;
//            }
//        }
//
//        System.out.println(count);

    }
}
