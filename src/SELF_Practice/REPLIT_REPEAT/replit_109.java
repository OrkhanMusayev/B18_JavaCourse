package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 * The code provided in your main method will take in five Strings and save them into an array called arr.  Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.
 *
 * Example:
 * arr -> ["apple", "banana"]
 *  prints: app
 *          ban
 */
public class replit_109 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];//{0,0,0,0,0}
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        for (int k=0;k<=arr.length-1;k++){
            System.out.println(arr[k].substring(0,3));
        }
    }
}
