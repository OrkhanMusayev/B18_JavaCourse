package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
 *
 * Example:
 *
 * nums -> [1, 1, 2, 3, 4, 3, 4]
 *          2
 */
public class replit_114 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++; // 1
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }
        }
    }
