package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * calculate the sum of all the numbers up to the n variable.
 *
 * for example:
 *
 * n=3
 *
 * sum = 1+2+3 = 6
 *
 * n = 5
 *  sum = 1+2+3+4+5 = 15
 *
 * hint: use a loop
 */
public class LoopCalculateSumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sumOfNum=0;

        for(int i =1; i <= n; i++){ // 3 ==> 1+2+3=6

            sumOfNum += i; // 1+2+3
        }
        System.out.println(sumOfNum);

    }
}

