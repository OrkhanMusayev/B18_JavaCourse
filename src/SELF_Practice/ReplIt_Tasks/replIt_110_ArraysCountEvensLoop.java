package SELF_Practice.ReplIt_Tasks;

import java.util.Scanner;

public class replIt_110_ArraysCountEvensLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        int count=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2==0 ) {
                count++;
            }
        }System.out.print(count);
            }

        }
