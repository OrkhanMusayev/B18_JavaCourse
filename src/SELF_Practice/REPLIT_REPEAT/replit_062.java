package SELF_Practice.REPLIT_REPEAT;

import java.util.Scanner;

/**
 *  Write a program that will print out first and last letters together.

 *     adobe
 *     ae
 */
public class replit_062 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        char firstLetter =word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);


        System.out.println(firstLetter+""+lastLetter);
    }
}
