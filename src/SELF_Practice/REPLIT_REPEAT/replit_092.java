package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.  Calculate factorial and output result to the console.
 * Example:
 * input: 5
 * output: 120
 */
public class replit_092 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1;
        while (n >= 1) {
            result = result * n;
            n--; // ex: !5=5*4*3*2*1=120
        }

        System.out.println(result);
    }
}