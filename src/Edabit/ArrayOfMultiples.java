package Edabit;

import java.util.Arrays;

/**
 * Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
 *
 * Examples
 * arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
 */
public class ArrayOfMultiples {

    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num * (i + 1); // 7*(7+1)=56
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOfMultiples(7,5)));
    }
}