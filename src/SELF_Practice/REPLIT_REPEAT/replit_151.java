package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * Write a void method printUniqueNumbers that will print unique numbers from an array of ints.
 *
 * Example:
 * input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
 * output:
 * 2
 * 9
 * 34
 */
public class replit_151 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int testNum : nums) {
            int count = 0;
            for (int comp : nums) {
                if (testNum == comp)
                    count++;
                if (count > 1)
                    break;
            }
            if (count == 1)
                System.out.println(testNum);
        }

    }
}
