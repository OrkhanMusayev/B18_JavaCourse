package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array. If no consecutive 5s or no 5s are detected in your code then print false.
 *
 * nums → [1, 5, 5, 1, 1] → true
 * nums → [1, 8, 5, 5, 0] → true
 * nums → [1, 5, 4, 1, 5] → false
 * nums → [1, 4, 4, 1, 99] → false
 */
public class replit_104 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        boolean result = false; //  default value of boolean is false

        for(int i=0; i <= nums.length-1;i++){
            if(nums[i] == 5 && nums[i+1] == 5){// we did i+1 because if i=5 i+1=>next number should be 5 as well
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
